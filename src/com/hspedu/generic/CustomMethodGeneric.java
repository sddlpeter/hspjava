package com.hspedu.generic;

import java.util.ArrayList;

public class CustomMethodGeneric {
    public static void main(String[] args) {
//        Tesla tesla = new Tesla();
//        tesla.fly("宝马", 100); // 当调用方法时，传入参数，编译器会确定类型
//        System.out.println("----------------");
//        tesla.fly("奔驰", "很贵");

        // T - String, R - ArrayList
        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(), 11.3f);



    }
}


class Tesla {
    public void run() { // 普通方法

    }

    //1. <T, R> 是泛型标识符
    //2. 是提供给fly方法使用的
    public <T,R> void fly(T t, R r) {
        System.out.println(t);
        System.out.println(r);
    }


}

class Fish<T, R> {
    public void run() {

    }
    public <U, M> void eat(U u, M m) { // 泛型方法

    }

    //1. 下面方法不是泛型方法
    //2. 是hi方法使用了类声明的泛型
    public void hi(T t) {

    }

    // 泛型方法，既可以使用类声明的泛型，也可以使用自己声明泛型
    public <K> void hello(R r, K k) {
        System.out.println(r.getClass());
        System.out.println(k.getClass());
    }
}