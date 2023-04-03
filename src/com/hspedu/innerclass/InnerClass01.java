package com.hspedu.innerclass;

public class InnerClass01 {
    public static void main(String[] args) {
        new Outer(20).m1();

    }
}

class Outer {
    private int n = 10;
    public void m1() {
        System.out.println("n = " + n);
        class Inner {

        }

    }
    {
        System.out.println("ordinary code block");
    }
    public Outer(int n) {
        this.n = n;
    }

    class Inner {

    }
}
