package com.hspedu.collection;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        Shape shape = new Shape("Square");
        shape.hashCode();

        HashSet set = new HashSet();
        set.add("java");
        set.add("php");
        set.add("java");
    }
}

class Shape {
    String name;
    public Shape(String name) {
        this.name = name;
    }
}