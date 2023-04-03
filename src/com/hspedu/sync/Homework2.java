package com.hspedu.sync;

public class Homework2 {
    public static void main(String[] args) {
        Withdraw withdraw = new Withdraw();
        Thread t1 = new Thread(withdraw);
        Thread t2 = new Thread(withdraw);
        Thread t3 = new Thread(withdraw);
        t1.start();
        t2.start();
        t3.start();
    }
}

class Withdraw implements Runnable {
    int money = 10000;
    boolean loop = true;
    @Override
    public void run() {
        while (loop) {
            synchronized (this) {
                if (money >= 1000) {
                    money -= 1000;
                    System.out.println(Thread.currentThread().getName() +  " 从账户里取出现金 " + 1000 + "， 账户余额 " + money);

                } else {
                    this.setLoop(false);
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("账户余额不足，退出取现...");
    }


    // 成员方法的锁，默认是this对象，因为Thread传入的是同一个对象，所以这里会起到互斥的作用
    public synchronized void getCash() {
        if (money >= 1000) {
            money -= 1000;
            System.out.println(Thread.currentThread().getName() +  " 从账户里取出现金 " + 1000 + "， 账户余额 " + money);

            return;
        }
        this.setLoop(false);
    }



    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
