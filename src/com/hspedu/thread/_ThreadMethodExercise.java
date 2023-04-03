package com.hspedu.thread;

public class _ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        SubThread subThread = new SubThread();
        Thread t1 = new Thread(subThread);

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hi " + i);
            if (i == 5) {
                t1.start();
                t1.join();
            }
        }
        System.out.println("主线程结束...");
    }
}

class SubThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello " + i);
        }
        System.out.println("子线程结束...");
    }
}