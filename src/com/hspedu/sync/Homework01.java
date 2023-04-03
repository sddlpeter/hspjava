package com.hspedu.sync;

import java.util.Random;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread t1 = new Thread(t);
        EndThread t2 = new EndThread(t);

        t1.start();
        t2.start();
    }
}

class MyThread implements Runnable {


    boolean loop = true;
    @Override
    public void run() {
        Random random = new Random();
        while (loop) {
            System.out.println(Thread.currentThread().getName() + " 输出随机数 " +  random.nextInt(100));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

class EndThread extends Thread {
    MyThread mt;
    Scanner scanner = new Scanner(System.in);
    public EndThread(MyThread mt) {
        this.mt = mt;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("请输入命令:");
            String input = scanner.next();
            System.out.println("您输入的是： " + input);
            if (input.equals("q")) {
                System.out.println("退出程序...");
                mt.setLoop(false);
                break;
            }
        }
    }
}