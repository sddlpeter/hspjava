package com.hspedu.generic;

import java.util.ArrayList;
import java.util.List;

public class _GenericExtends {
    public static void main(String[] args) {

        // 泛型在使用时，不具有继承特点
        // List<Object> list = new ArrayList<String>();

        // 举例说明
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AAA> list3 = new ArrayList<>();
        List<BBB> list4 = new ArrayList<>();
        List<CCC> list5 = new ArrayList<>();



        // List<?> 表示所有的类型都可以接受
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);


        // List<? extends AAA> c  表示AAA和他的子类
//        printCollection2(list1);  // 错误
//        printCollection2(list2);  // 错误
        printCollection2(list3);  // ok
        printCollection2(list4);  // ok
        printCollection2(list5);  // ok


        //List<? super  AAA> c  表示AAA和他的父类
        printCollection3(list1);  // ok
//        printCollection3(list2);  // 错误
        printCollection3(list3);  // ok
//        printCollection3(list4);  // 错误
//        printCollection3(list5);  // 错误


    }

    // List<?>表示任意的泛型类型都可以接收
    public static void printCollection1(List<?> c) {
        for (Object obj : c) {
            System.out.println(obj);
        }
    }

    // ? extends AAA 表示上限，可以接受AAA或者AAA的子类
    public static void printCollection2(List<? extends  AAA> c) {
        for (Object obj : c) {
            System.out.println(obj);
        }
    }
    // ? super AAA  表示下限，表示支持AAA类，以及AAA类的父类，不限于直接父类
    public static void printCollection3(List<? super  AAA> c) {
        for (Object obj : c) {
            System.out.println(obj);
        }
    }
}

class AAA {

}

class BBB extends AAA {

}

class CCC extends BBB {

}
