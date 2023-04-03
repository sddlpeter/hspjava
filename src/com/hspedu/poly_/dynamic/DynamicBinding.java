package com.hspedu.poly_.dynamic;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}

class A {
    int i = 10;
    public int sum() {
        return getI() + 10;
    }
    public int getI() {
        return i;
    }
    public int sum1() {
        return i + 10;
    }
}

class B extends A {
    int i = 20;
//    public int sum() {
//        return i + 20;
//    }
    public int getI() {
        return i;
    }
//    public int sum1() {
//        return i + 10;
//    }
}
