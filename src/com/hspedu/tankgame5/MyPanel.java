package com.hspedu.tankgame5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//为了让panel不停的重绘子弹，需要将MyPanel实现Runnable，当作一个线程使用
public class MyPanel extends JPanel implements KeyListener, Runnable {
    Hero hero = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();

    // 当子弹击中坦克时，加入一个bomb对象
    Vector<Bomb> bombs = new Vector<>();

    int enemyTankSize = 6;
    int score = 0;

    // 定义三张炸弹图片
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;



    public MyPanel() {
        hero = new Hero(500, 500);

        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank((i + 1) * 100, 0);
            enemyTank.setEnemyTanks(enemyTanks);
            enemyTank.setDirection(2);
            new Thread(enemyTank).start();
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirection());
            enemyTank.shots.add(shot);
            new Thread(shot).start();
            enemyTanks.add(enemyTank);
        }

        // 初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/b1.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/b2.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/b3.png"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        if (hero != null && hero.isLive) {
            drawTank(hero.getX(), hero.getY(), g, hero.getDirection(), 0);
        }


        // 画出hero射击的子弹
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (shot != null && shot.isLive) {
                g.draw3DRect(shot.x, shot.y, 1, 1, false);
            } else if (!shot.isLive) {
                hero.shots.remove(shot);
            }
        }

        // 如果bombs集合中有炸弹，需要画出
        for (int i = 0; i < bombs.size(); i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Bomb bomb = bombs.get(i);
            //根据当前bomb对象的life值画出图片
            if (bomb.life > 6) {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
            } else {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
            }
            bomb.lifeDown();
            // 如果bomb life为0，就从bombs集合中删除
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }

        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);

            // 当敌人坦克是存活，才绘出
            if (enemyTank.isLive) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 1);

                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    Shot shot = enemyTank.shots.get(j);
                    if (shot.isLive) {
                        g.draw3DRect(shot.x, shot.y, 1, 1, false);
                    } else {
                        enemyTank.shots.remove(shot);
                    }
                }
            }
        }
    }

    public void drawTank(int x, int y, Graphics g, int direction, int type) {
        switch (type) {
            case 0:
                g.setColor(Color.yellow);
                break;
            case 1:
                g.setColor(Color.cyan);
                break;
        }

        switch (direction) {
            case 0:  // 向上
                g.fill3DRect(x, y, 10, 60,false);
                g.fill3DRect(x + 30, y, 10, 60,false);
                g.fill3DRect(x + 10, y + 10, 20, 40,false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y, x + 20, y + 30);

                break;
            case 1: // 向右
                g.fill3DRect(x, y, 60, 10,false);
                g.fill3DRect(x, y + 30, 60, 10,false);
                g.fill3DRect(x + 10, y + 10, 40, 20,false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2: // 向下
                g.fill3DRect(x, y, 10, 60,false);
                g.fill3DRect(x + 30, y, 10, 60,false);
                g.fill3DRect(x + 10, y + 10, 20, 40,false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 60, x + 20, y + 30);
                break;
            case 3: // 向左
                g.fill3DRect(x, y, 60, 10,false);
                g.fill3DRect(x, y + 30, 60, 10,false);
                g.fill3DRect(x + 10, y + 10, 40, 20,false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;

            default:
                System.out.println("暂时没做处理");
        }
    }

    public void hitEnemy() {
        for (Shot shot : hero.shots) {
            if (shot != null &&  shot.isLive) {
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(shot, enemyTank);
                }
            }
        }
    }

    public void hitHero() {
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemy = enemyTanks.get(i);
                for (int j = 0; j < enemy.shots.size(); j++ ) {
                    Shot s = enemy.shots.get(j);
                    if (hero.isLive && s.isLive) {
                        hitTank(s, hero);
                    }
                }
            }
    }


    public void hitTank(Shot s, Tank enemyTank) {
        switch (enemyTank.getDirection()) {
            case 0:
            case 2:  // down
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    // 创建bomb对象，加入bombs集合
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                    enemyTanks.remove(enemyTank);
                    score++;
                    System.out.println("score=" + score);
                }
                break;
            case 1:
            case 3:
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                    enemyTanks.remove(enemyTank);
                    score++;
                    System.out.println("score=" + score);
                }
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirection(0);
            if (hero.getY() > 0) {
                hero.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirection(1);
            if (hero.getX() + 60 < 1000) {
                hero.moveRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirection(2);
            if (hero.getY() + 60 < 750) {
                hero.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirection(3);
            if (hero.getX() > 0) {
                hero.moveLeft();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_J) {
            System.out.println("用户按下J键");
            if (hero.shots == null || hero.shots.size() < 10) {
                hero.shotEnemy();
            }

        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {  // 每隔100毫秒，重绘区域
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            hitEnemy();

            hitHero();
            this.repaint();
        }
    }
}
