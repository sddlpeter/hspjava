package com.hspedu.tankgame2;

import java.awt.*;

public class Bullet implements Runnable {
    private int x;
    private int y;
    private int direction;
    private int speed = 5;
    private int type;
    Graphics g;

    public Bullet(int x, int y, int direction, Graphics g) {
        this.x = x;
        this.y = y;
        this.direction = direction ;
        this.g = g;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public void run() {
        g.setColor(Color.white);
        while (true) {
            if (direction == 0) {
                y = y - 10;
            } else if (direction == 1) {
                x = x + 10;
            } else if (direction == 2) {
                y = y + 10;
            } else if (direction == 3) {
                x = x - 10;
            }
            if (x <= 0 || y <= 0 || x >= 1000 || y >= 750) {
                break;
            }
            System.out.println("子弹发射了...");
            drawBullet(this, g);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void drawBullet(Bullet bullet, Graphics g) {

        g.drawLine(bullet.x, bullet.y, bullet.x, bullet.y - 10);
    }
}
