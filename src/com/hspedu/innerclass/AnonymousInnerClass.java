package com.hspedu.innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {
    private int n1 = 10;
    public void method() {
        //1. 需求： 想使用AI接口，并创建对象
        //2. 传统方式，是写一个类，实现该接口，并创建对象
        //3. 但是需求是Tiger/Dog类只是使用以此，后面不再使用
        //4. 可以使用匿名内部类来简化开发
        //5. tiger的编译类型是？ IA
        //6. tiger的运行类型是？ 就是匿名内部类 XXXX => Outer04$1
        /*
            我们看底层 会分配一个类名 Outer04$1
            class Outer04$1 implements IA {
                @Override
                public void cry() {
                    System.out.println("老虎叫唤...");
                }
            }
         */
//        IA tiger = new Tiger();
//        tiger.cry();

        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        tiger.cry();
        System.out.println("tiger的运行类型=" + tiger.getClass());

        //演示基于类的匿名内部类
        //1. father的编译类型是 Father
        //2. father的运行类型是 Outer04$2
        //3. 底层会创建匿名内部类
        /*
            class Outer04$2 extends Father {

            }
         */
        //4. father的运行类型是一个新的类，这个类继承了Father，这个类名是Outer04$2
        Father father0 = new Father("jack");
        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };

        System.out.println("father对象的运行类型=" + father.getClass());
        father.test();

        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("小猫吃鱼...");
            }
        };
        animal.eat();


    }
}


interface IA {
    public void cry();
}

//class Tiger implements IA {
//
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤...");
//    }
//}

//class Dog implements IA {
//
//    @Override
//    public void cry() {
//        System.out.println("小狗汪汪叫...");
//    }
//}

class Father {
    public Father(String name) {
        System.out.println("接收到name=" + name);
    }
    public void test() {

    }
}

abstract class Animal {
    abstract void eat();
}