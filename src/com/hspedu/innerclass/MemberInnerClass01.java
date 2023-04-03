package com.hspedu.innerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();

        // 第一种方式
        Outer08.Inner08 inner08 = outer08.new Inner08();
        new Outer08().new Inner08().say();


        // 第二种方式
        Outer08.Inner08 inner081 = outer08.getInner08Instance();
    }
}


class Outer08 {
    private int n1 = 10;
    public String name = "Jack";

    private void say() {
        System.out.println("say method");
    }

    public class Inner08 {
        private double sal = 99.9;
        private int n1 = 1000;
        public void say() {
            System.out.println("n1 = " + n1 + " name= " + name);
            Outer08.this.say();
        }
    }

    public void t1() {
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);
    }

    public Inner08 getInner08Instance() {
        return  new Inner08();
    }
}