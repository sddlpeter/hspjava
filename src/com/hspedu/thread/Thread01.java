package com.hspedu.thread;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        // 创建cat对象，可以当作线程使用
        Cat cat = new Cat();
        cat.start();  // 启动线程 -> 最终会执行run方法
        // cat.run();

        // 当main线程启动子线程thread-0，主线程不会阻塞，会继续执行
        // 这时主线程和子线程是交替执行
        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程计数 i=" + i);
            Thread.sleep(1000);
        }
    }
}

// 当一个类继承了thread类，该类就可以当作一个线程使用
//2. 我们会重写run方法，写上自己的业务方法
//3. run thread类 实现了runnable 接口run方法
class Cat extends Thread {
    int times = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("喵喵，这是小猫咪" + (++times) + " 线程名称=" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times >= 80) break;
        }
    }
}