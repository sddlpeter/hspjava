package com.hspedu.scanner_;

public class CodeBlockExercise01 {
    public static void main(String[] args) {
        System.out.println(Person.total);
        System.out.println(Person.total);
    }
}

class Person {
    public static int total;
    static {
        total = 100;
        System.out.println("in static block!");
    }
}
