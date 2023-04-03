package com.hspedu.innerclass;

public class Test {
    public Test() {
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        System.out.println(s2.a);
    }

    class Inner {
        public int a = 5;
    }
    public static void main(String[] args) {
        Test t = new Test();
    }
}


