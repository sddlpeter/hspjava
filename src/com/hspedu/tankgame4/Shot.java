package com.hspedu.tankgame4;

public class Shot implements Runnable {
    int x; // 子弹x坐标
    int y;
    int direction = 0;
    int speed = 10;
    boolean isLive = true; // 子弹是否存活

    public Shot(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }


    @Override
    public void run() { // 射击行为

        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            switch (direction) {
                case 0: // up
                    y -= speed;
                    break;
                case 1: // right
                    x += speed;
                    break;
                case 2: // down
                    y += speed;
                    break;
                case 3:
                    x -= speed;
                    break;
            }

            System.out.println("bullet x=" + x + " y=" + y);
            if (x <= 0 || y <= 0 || x >= 1000 || y >= 750 || !isLive) {
                isLive = false;
                break;
            }
        }
    }
}
