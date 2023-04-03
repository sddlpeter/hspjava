package com.hspedu.generic;

import java.util.List;

public class _Generic03 {
    public static void main(String[] args) {
        Person<String> person = new Person<String>("韩顺平教育");
        person.t();

        /*
        class Person<E> {
            String s;  // E表示s的数据类型，该数据类型是在定义Person对象的时候指定的，即在编译期间就确定E是什么类型

            public Person(String s) {  // E也可以是参数类型
                this.s = s;
            }

            public String f() {  // 返回类型使用E
                return s;
            }
         */

        Person<Integer> integerPerson = new Person<Integer>(100);
        integerPerson.t();

        /*
        class Person<E> {
            Integer s;  // E表示s的数据类型，该数据类型是在定义Person对象的时候指定的，即在编译期间就确定E是什么类型

            public Person(Integer s) {  // E也可以是参数类型
                this.s = s;
            }

            public Integer f() {  // 返回类型使用E
                return s;
            }
         */

        List list;
        Car<Car> car = new Car<Car>(new Car(new Object()));
        car.func();
    }
}

class Car<HXX> {
    HXX s;

    public Car(HXX s) {
        this.s = s;
    }
    public HXX getVal() {
        return s;
    }
    public void func() {
        System.out.println(s.getClass());
    }
}

class Person<E> {
    E s;  // E表示s的数据类型，该数据类型是在定义Person对象的时候指定的，即在编译期间就确定E是什么类型

    public Person(E s) {  // E也可以是参数类型
        this.s = s;
    }

    public E f() {  // 返回类型使用E
        return s;
    }

    public void t() {
        System.out.println(s.getClass());
    }
}
