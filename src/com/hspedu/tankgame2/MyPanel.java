package com.hspedu.tankgame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener {
    Hero hero = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;
    public MyPanel() {
        hero = new Hero(100, 100);
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank((i + 1) * 100, 0);
            enemyTank.setDirection(2);
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        drawTank(hero.getX(), hero.getY(), g, hero.getDirection(), 0);
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 1);
        }
    }

    public void drawBullet(Bullet bullet, Graphics g) {
        g.setColor(Color.white);
        g.drawLine(bullet.getX(), bullet.getY(), bullet.getX(), bullet.getY() - 500);
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

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            hero.setDirection(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.setDirection(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.setDirection(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.setDirection(3);
            hero.moveLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_J) {
            System.out.println("按键J");
            Bullet bullet = new Bullet(hero.getX() + 20, hero.getY(), hero.getDirection(), getGraphics());
            Thread t = new Thread(bullet);
            t.start();
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
