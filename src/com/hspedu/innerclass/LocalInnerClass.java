package com.hspedu.innerclass;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("outer02 的hashcode是" + outer02);
    }
}


class Outer02 { // 外部类
    private int n1 = 100;
    private void m2() { // 私有方法
        System.out.println("Outer02 m2() 被调用");
    }
    public void m1() { // 方法
        // 内部类的作用域只能在m1这个方法中
        String name = "xxx";
        final class Inner02 { // 局部内部类
            public int n1 = 800;
            //可以访问外部类的所有成员和方法，包含私有成员变量和方法
            public void f1() {
                System.out.println("n1 = " + n1 + "   外部类的 n1 = " + Outer02.this.n1);
                System.out.println("Outer02.this hashcode = " + Outer02.this);
                m2();
            }
        }
        // 外部类在方法中，可以创建Inner02对象，然后又调用方法即可
        Inner02 inner02 = new Inner02();
        inner02.f1();


//        class Inner03 extends Inner02 {
//
//        }
    }

    { //代码块
        class Inner03 {

        }
    }


}