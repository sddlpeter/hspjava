package com.hspedu.wrapper;

public class Integer01 {
    public static void main(String[] args) {
        int n = 100;
        Integer integer = Integer.valueOf(n);
        Double d = 100d; //自动装箱，Double.valueOf(100d);
        Float f = 1.5f; //自动装箱，Float.valueOf(1.5f);

        Object obj1 = true ? Integer.valueOf(1) : Double.valueOf(2.0);
        System.out.println(obj1);
    }
}
