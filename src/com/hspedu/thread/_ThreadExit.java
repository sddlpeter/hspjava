package com.hspedu.thread;

public class _ThreadExit {
    public static void main(String[] args) {
        AThread st = new AThread();
        new Thread(st).start();
        for (int i = 0; i <= 60; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main 线程 运行中" + i);
            if (i == 30) {
                st.setLoop(false);
            }
        }
    }
}

class AThread implements Runnable {
    boolean loop = true;
    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("AThread 运行中...");
        }
        System.out.println(Thread.currentThread().getName() + "线程退出...");
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
