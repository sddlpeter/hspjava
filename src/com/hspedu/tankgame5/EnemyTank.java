package com.hspedu.tankgame5;

import java.util.Random;
import java.util.Vector;

public class EnemyTank extends Tank implements Runnable {
    Vector<Shot> shots = new Vector<>();
    Vector<EnemyTank> enemyTanks = new Vector<>();
    boolean isLive = true;
    public EnemyTank(int x, int y) {
        super(x, y);
        this.setType(1);
    }

    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }


    public boolean isTouchEnemyTank() {
        switch (this.getDirection()) {
            case 0: // 我方坦克向上移动
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (this == enemyTank) continue;

                    // 敌方坦克向上或向下移动
                    if (enemyTank.getDirection() == 0 || enemyTank.getDirection() == 2) {
                        // 我方左上角跟敌方碰撞
                        if (this.getX() >= enemyTank.getX()
                                && this.getX() <= enemyTank.getX() + 40
                                && this.getY() >= enemyTank.getY()
                                && this.getY() <= enemyTank.getY() + 60) {
                            return true;
                        }

                        // 我方右上角跟敌方碰撞
                        if (this.getX() + 40 >= enemyTank.getX()
                                && this.getX() + 40 <= enemyTank.getX() + 40
                                && this.getY() >= enemyTank.getY()
                                && this.getY() <= enemyTank.getY() + 60) {
                            return true;
                        }
                    }
                    // 敌方坦克向左或向右移动
                    if (enemyTank.getDirection() == 1 || enemyTank.getDirection() == 3) {
                        // 我方左上角跟敌方碰撞
                        if (this.getX() >= enemyTank.getX()
                                && this.getX() <= enemyTank.getX() + 60
                                && this.getY() >= enemyTank.getY()
                                && this.getY() <= enemyTank.getY() + 40) {
                            return true;
                        }

                        // 我方右上角跟敌方碰撞
                        if (this.getX() + 40 >= enemyTank.getX()
                                && this.getX() + 40 <= enemyTank.getX() + 60
                                && this.getY() >= enemyTank.getY()
                                && this.getY() <= enemyTank.getY() + 40) {
                            return true;
                        }
                    }

                }
                break;
            case 1:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (this == enemyTank) continue;

                    // 敌方坦克向上或向下移动
                    if (enemyTank.getDirection() == 0 || enemyTank.getDirection() == 2) {
                        if (this.getX() + 60 >= enemyTank.getX()
                                && this.getX() + 60 <= enemyTank.getX() + 40
                                && this.getY() >= enemyTank.getY()
                                && this.getY() <= enemyTank.getY() + 60) {
                            return true;
                        }

                        if (this.getX() + 60 >= enemyTank.getX()
                                && this.getX() + 60 <= enemyTank.getX() + 40
                                && this.getY() + 40 >= enemyTank.getY()
                                && this.getY() + 40 <= enemyTank.getY() + 60) {
                            return true;
                        }
                    }
                    // 敌方坦克向左或向右移动
                    if (enemyTank.getDirection() == 1 || enemyTank.getDirection() == 3) {
                        if (this.getX() + 60 >= enemyTank.getX()
                                && this.getX() + 60 <= enemyTank.getX() + 60
                                && this.getY() >= enemyTank.getY()
                                && this.getY() <= enemyTank.getY() + 40) {
                            return true;
                        }

                        if (this.getX() + 60 >= enemyTank.getX()
                                && this.getX() + 60 <= enemyTank.getX() + 60
                                && this.getY() + 40 >= enemyTank.getY()
                                && this.getY() + 40 <= enemyTank.getY() + 40) {
                            return true;
                        }
                    }
                }
                break;
            case 2:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (this == enemyTank) continue;

                    // 敌方坦克向上或向下移动
                    if (enemyTank.getDirection() == 0 || enemyTank.getDirection() == 2) {
                        if (this.getX() >= enemyTank.getX()
                                && this.getX() <= enemyTank.getX() + 40
                                && this.getY() + 60 >= enemyTank.getY()
                                && this.getY() + 60 <= enemyTank.getY() + 60) {
                            return true;
                        }

                        if (this.getX() + 40 >= enemyTank.getX()
                                && this.getX() + 40 <= enemyTank.getX() + 40
                                && this.getY() + 60 >= enemyTank.getY()
                                && this.getY() + 60 <= enemyTank.getY() + 60) {
                            return true;
                        }
                    }
                    // 敌方坦克向左或向右移动
                    if (enemyTank.getDirection() == 1 || enemyTank.getDirection() == 3) {
                        if (this.getX() >= enemyTank.getX()
                                && this.getX() <= enemyTank.getX() + 60
                                && this.getY() + 60 >= enemyTank.getY()
                                && this.getY() + 60 <= enemyTank.getY() + 40) {
                            return true;
                        }

                        if (this.getX() + 40 >= enemyTank.getX()
                                && this.getX() + 40 <= enemyTank.getX() + 60
                                && this.getY() + 60 >= enemyTank.getY()
                                && this.getY() + 60 <= enemyTank.getY() + 40) {
                            return true;
                        }
                    }
                }
                break;
            case 3:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (this == enemyTank) continue;

                    // 敌方坦克向上或向下移动
                    if (enemyTank.getDirection() == 0 || enemyTank.getDirection() == 2) {
                        if (this.getX() >= enemyTank.getX()
                                && this.getX() <= enemyTank.getX() + 40
                                && this.getY() >= enemyTank.getY()
                                && this.getY() <= enemyTank.getY() + 60) {
                            return true;
                        }

                        if (this.getX() >= enemyTank.getX()
                                && this.getX() <= enemyTank.getX() + 40
                                && this.getY() + 40 >= enemyTank.getY()
                                && this.getY() + 40 <= enemyTank.getY() + 60) {
                            return true;
                        }
                    }
                    // 敌方坦克向左或向右移动
                    if (enemyTank.getDirection() == 1 || enemyTank.getDirection() == 3) {
                        if (this.getX() >= enemyTank.getX()
                                && this.getX() <= enemyTank.getX() + 60
                                && this.getY() >= enemyTank.getY()
                                && this.getY() <= enemyTank.getY() + 40) {
                            return true;
                        }

                        if (this.getX() >= enemyTank.getX()
                                && this.getX() <= enemyTank.getX() + 60
                                && this.getY() + 40 >= enemyTank.getY()
                                && this.getY() + 40 <= enemyTank.getY() + 40) {
                            return true;
                        }
                    }
                }
                break;
        }
        return false;
    }

    @Override
    public void run() {
        while (true) {
            if (isLive && shots.size() <= 3) {
                Shot s = null;
                switch (getDirection()) {
                    case 0:
                        s = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1:
                        s = new Shot(getX() + 60, getY() + 20, 1);
                        break;
                    case 2:
                        s = new Shot(getX() + 20, getY() + 60, 2);
                        break;
                    case 3:
                        s = new Shot(getX(), getY() + 20, 3);
                        break;
                }

                shots.add(s);
                new Thread(s).start();

            }

            switch (getDirection()) {
                case 0:
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0 && !isTouchEnemyTank()) {
                            moveUp();
                        }

                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }
                    break;

                case 1:
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 40 < 1000 && !isTouchEnemyTank()) {
                            moveRight();
                        }


                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }
                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < 750 && !isTouchEnemyTank()) {
                            moveDown();
                        }

                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }
                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0 && !isTouchEnemyTank()){
                            moveLeft();
                        }

                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }
                    break;
            }

            setDirection((int) (Math.random() * 4));

            if (!isLive) {
                break;
            }
        }
    }
}
