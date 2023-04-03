package com.hspedu.thread;

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

        SellTicket2 sellTicket2 = new SellTicket2();
        new Thread(sellTicket2).start();
        new Thread(sellTicket2).start();
        new Thread(sellTicket2).start();
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