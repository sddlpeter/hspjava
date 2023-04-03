package com.hspedu.thread;

public class _ThreadState {
    public static void main(String[] args) throws InterruptedException {
        ThreadState threadState = new ThreadState();
        threadState.setName("子线程");
        System.out.println(threadState.getName() + " " + threadState.getState());
        threadState.start();

        while (threadState.getState() != Thread.State.TERMINATED) {
            System.out.println(threadState.getName() + " 状态 " + threadState.getState());
            Thread.sleep(1000);
        }
        System.out.println(threadState.getName() + " " + threadState.getState());
    }
}

class ThreadState extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            break;
        }
    }
}
