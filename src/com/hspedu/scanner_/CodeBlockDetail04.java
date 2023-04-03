package com.hspedu.scanner_;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        new B02();
    }
}


class A02 {
    private static int n1 = getVal01();
    static {
        System.out.println("A02 static code...");
    }
    {
        System.out.println("A02 ordinary code...");
    }

    public int n3 = getVal02();
    public static int getVal01() {
        System.out.println("getVal01");
        return 10;
    }
    public int getVal02() {
        System.out.println("getVal02");
        return 20;
    }
    public A02() {
        System.out.println("A02 constructor");
    }
}

class B02 extends A02 {
    private static int n3 = getVal03();
    static {
        System.out.println("B02 static code");
    }
    public int n5 = getVal04();
    {
        System.out.println("B02 ordinary code");
    }
    public static int getVal03() {
        System.out.println("getVal03");
        return 10;
    }

    public int getVal04() {
        System.out.println("getVal04");
        return 10;
    }
    public B02() {
        // hided
        // super();
        // ordinary code
        System.out.println("B02 constructor");
    }
}