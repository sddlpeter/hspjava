package com.hspedu.sync;

public class _SellTickets {
    public static void main(String[] args) {
//        SellTicket1 sellTicket1 = new SellTicket1();
//        SellTicket1 sellTicket2 = new SellTicket1();
//        SellTicket1 sellTicket3 = new SellTicket1();
//
//
//        // 这里会出现超卖问题
//        sellTicket1.start();
//        sellTicket2.start();
//        sellTicket3.start();

//        SellTicket2 sellTicket2 = new SellTicket2();
//        new Thread(sellTicket2).start();
//        new Thread(sellTicket2).start();
//        new Thread(sellTicket2).start();

        SellTicket3 sellTicket3 = new SellTicket3();
        Thread t1 = new Thread(sellTicket3);
        Thread t2 = new Thread(sellTicket3);
        Thread t3 = new Thread(sellTicket3);
        t1.setName("售票窗口 1");
        t2.setName("售票窗口 2");
        t3.setName("售票窗口 3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class SellTicket3 implements Runnable {
    private int tickets = 100;
    private static boolean loop = true;
    Object obj = new Object();

    // 静态同步方法的锁是当前类本身
    public synchronized static void m1() {

    }

    // 如果在静态方法中，实现一个同步代码块，锁需要加在类上，而不是加在this对象上
    public static void m2() {
        synchronized (SellTicket3.class) {
            System.out.println("m2");
        }
    }


    public /* synchronized */ void sell() { // 同步方法，在同一个时刻，只能有一个线程来执行run方法，这时候锁默认是加在this对象上
        // 锁可以加在this对象，也可以加在任意一个对象上
        synchronized (/* this */ obj) {
            if (tickets <= 0) {
                System.out.println("售票结束...");
                loop = false;
                return;
            }
            System.out.println(Thread.currentThread().getName() + " 卖了一张票，剩余票数: " + --tickets);
        }
    }

    @Override
    public void run() {  // 同步方法，在同一个时刻，只能有一个线程来执行run方法
        while (loop) {
            sell();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class SellTicket1 extends Thread {
    private static int tickets = 100;
    @Override
    public void run() {
        while (true) {
            if (tickets <= 0) {
                System.out.println("售票结束...");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 卖了一张票，剩余票数: " + --tickets);
        }
    }
}


class SellTicket2 implements Runnable {
    private int tickets = 100;
    @Override
    public void run() {
        while (true) {
            if (tickets <= 0) {
                System.out.println("售票结束...");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 卖了一张票，剩余票数: " + --tickets);
        }
    }
}