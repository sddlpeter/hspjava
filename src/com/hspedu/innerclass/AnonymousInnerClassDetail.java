package com.hspedu.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}

class Outer05 {
    private int n1 = 99;
    public void f1() {
        Person p = new Person() {
            int n1 = 100;
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法 " + Outer05.this.n1);
            }
        };

        p.hi(); //动态绑定，运行类型是Outer05@1

        System.out.println(p.getClass());
        System.out.println(p.getClass());

//        new Person() {
//            @Override
//            public void ok(String str) {
//                super.ok(str);
//            }
//        }.ok("jack");
    }
}


class Person {
    public void hi() {
        System.out.println("Person hi()");
    }

    public void ok(String str) {
        System.out.println("Person ok " + str);
    }

}