package com.hspedu.scanner_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A {
    private static int n1 = getN1();

    static {
        System.out.println("A 静态代码快01");
    }

    public static int getN1() {
        System.out.println("getN1被调用...");
        return 100;
    }
}
