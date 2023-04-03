package com.hspedu.thread;

public class Thread03 {
    public static void main(String[] args) {
        T3 t3 = new T3();
        T4 t4 = new T4();

        Thread thread1 = new Thread(t3);
        thread1.start();

        Thread thread2 = new Thread(t4);
        thread2.start();

        System.out.println("main 线程继续...");
    }
}


class T3 implements Runnable {

    @Override
    public void run() {
        int times = 0;
        while (true) {
            System.out.println("hello world!  " + Thread.currentThread().getName());
            times++;
            if (times == 10) {
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class T4 implements Runnable {

    @Override
    public void run() {
        int times = 0;
        while (true) {
            System.out.println("hello world!  " + Thread.currentThread().getName());
            times++;
            if (times == 10) {
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}