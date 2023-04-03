package com.hspedu.thread;

public class _ThreadMethod3 {
    public static void main(String[] args) throws InterruptedException {
        MyGuardThread gt = new MyGuardThread();
        gt.setDaemon(true);
        gt.start();
        for (int i = 1; i <= 100; i++) {
            Thread.sleep(50);
            System.out.println("主线程运行中..." + i);
        }
        System.out.println("主线程运行结束...");

    }
}

class MyGuardThread extends Thread {
    int times = 0;
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("守护进程运行中......." + ++times);
        }

    }
}
