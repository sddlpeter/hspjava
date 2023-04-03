package com.hspedu.thread;

public class _ThreadMethod2 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();
        for (int i = 0; i < 20; i++) {
            if (i == 5) t.join();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " hi");
        }
    }
}

class T extends Thread {
    int times = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (++times == 20) break;
        }
    }
}