package com.hspedu.generic;

import java.util.*;

public class _GenericExercise {
    public static void main(String[] args) {
        Student tom = new Student("Tom", 20);
        Student jerry = new Student("Jerry", 18);
        Student mary = new Student("Mary", 22);

        HashSet<Student> set = new HashSet<Student>();
        HashMap<String, Student> map = new HashMap<String, Student>();

        set.add(tom);
        set.add(jerry);
        set.add(mary);

        map.put(tom.name, tom);
        map.put(jerry.name, jerry);
        map.put(mary.name, mary);

        System.out.println("---------- 使用obj遍历 -----------");

        for (Object obj : set) {
            Student stu = (Student) obj;
            System.out.println(stu);
        }

        System.out.println("---------- 使用stu遍历 -----------");


        for (Student stu : set) {
            System.out.println(stu);
        }

        Set<Map.Entry<String, Student>> entries = map.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            
        }


    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
