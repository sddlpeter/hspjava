package com.hspedu.thread;

public class _Runnable {
    public static void main(String[] args) throws InterruptedException {
//        T2 t = new T2();
//        // 创建了thread对象，把t对象放入到thread对象
//        Thread thread = new Thread(t);
//        thread.start();
//
//        for (int i = 0; i < 20; i++) {
//            System.out.println("主方法输出 " + i + " " + Thread.currentThread().getName());
//            Thread.sleep(500);
//        }

        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();
    }
}

class Animal {}
class Tiger extends Animal implements Runnable {

    @Override
    public void run() {
        System.out.println(" 老虎嗷嗷叫..." + Thread.currentThread().getName());
    }
}
class ThreadProxy implements Runnable {

    private Runnable target = null;

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }

    public void start() {
        start0();
    }

    public void start0() {
        run();
    }
}








class T2 implements Runnable {
    int times = 0;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hi! " + (++times) + " " + Thread.currentThread().getName());
            if (times == 10) break;
        }
    }
}
