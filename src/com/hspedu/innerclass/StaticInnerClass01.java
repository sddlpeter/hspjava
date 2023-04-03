package com.hspedu.innerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer09 outer09 = new Outer09();
        outer09.show();

        Outer09.Inner02 inner02 = new Outer09.Inner02();
        inner02.say();
    }
}

class Outer09 {
    private int n1 = 10;
    private static String name = "Jack";
    static class Inner02 {
        public void say() {
            System.out.println(name);
        }
    }

    public void show() {
        new Inner02().say();
    }

    public void m1() {
        Inner02 inner02 = new Inner02();
        inner02.say();
    }
}
