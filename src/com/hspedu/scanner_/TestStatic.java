package com.hspedu.scanner_;

public class TestStatic {
    public static void main(String[] args) {
        System.out.println(A01.getVal());
    }
}

class A01 {
    private static int n1 = getVal();
    private int n2 = getVal2();
    {
        System.out.println("A01的普通代码块");
    }

    static  {
        System.out.println("A01的静态代码块");
    }
    public A01() {
        super();
        System.out.println("A01的构造器");
    }

    public static int getVal() {
        System.out.println("getVal()方法被执行");
        return 10;
    }

    public int getVal2() {
        System.out.println("getVal2()方法被执行");
        return 30;
    }
}
