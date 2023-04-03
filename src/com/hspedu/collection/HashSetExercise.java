package com.hspedu.collection;

import java.util.HashSet;

public class HashSetExercise {
    public static void main(String[] args) {
        Employee e1 = new Employee("tom", 18);
        Employee e2 = new Employee("tom", 18);
        Employee e3 = new Employee("alice", 23);

        HashSet set = new HashSet();

        set.add(e1);
        set.add(e2);
        set.add(e3);

        System.out.println(set);


    }
}

class Employee {
    String name;
    int age;
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        int code = (name + age).hashCode();
        System.out.println(code);
        return code;
    }

    @Override
    public String toString() {
        return this.name + " " + age;
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        if (this.name.equals(e.name) && this.age == e.age) {
            return true;
        }
        return false;
    }
}
