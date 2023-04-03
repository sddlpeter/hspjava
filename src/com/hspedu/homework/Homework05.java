package com.hspedu.homework;

public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }
}

class B {

}

class A {
    private String name = "mary";
    public void m1() {
        new B() {
            final String name = "jack";
            public void show() {
                System.out.println("name = " + A.this.name);
            }
        }.show();
    }
}
