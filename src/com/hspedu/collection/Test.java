package com.hspedu.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Person("jack"));
        list.add(new Person("mary"));
        list.add(new Person("alice"));

        for (Object p : list) {
            Person per = (Person) p;
            System.out.println(per.getName());
        }
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}