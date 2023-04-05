package com.hspedu.tankgame5;

import java.util.Random;
import java.util.Vector;

public class EnemyTank extends Tank implements Runnable {
    Vector<Shot> shots = new Vector<>();
    Random random = new Random();
    boolean isLive = true;
    public EnemyTank(int x, int y) {
        super(x, y);
        this.setType(1);
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
                        if (getY() > 0) {
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
                        if (getX() + 40 < 1000) {
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
                        if (getY() + 60 < 750) {
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
                        if (getX() > 0){
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




//            int direct = random.nextInt(4);
//            if (direct == 0) {
//                this.setDirection(0);
//                this.setY(this.getY() - random.nextInt(30));
//            } else if (direct == 1) {
//                this.setDirection(1);
//                this.setX(this.getX() + random.nextInt(30));
//            } else if (direct == 2) {
//                this.setDirection(2);
//                this.setY(this.getY() + random.nextInt(30));
//            } else if (direct == 3) {
//                this.setDirection(3);
//                this.setX(this.getX() - random.nextInt(30));
//            }
//
//            Shot shot = new Shot(this.getX() + 20, this.getY() + 60, this.getDirection());
//            this.shots.add(shot);
//            new Thread(shot).start();

        }
    }
}
