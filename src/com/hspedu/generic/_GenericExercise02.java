package com.hspedu.generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _GenericExercise02 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 3000, new MyDate(12, 01, 2000));
        Employee e2 = new Employee("Alice", 4000, new MyDate(10, 22, 1995));
        Employee e3 = new Employee("Alice", 5000, new MyDate(3, 12, 1995));

        ArrayList<Employee> list = new ArrayList();
        list.add(e1);
        list.add(e2);
        list.add(e3);

        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getBirthday().compareTo(o2.getBirthday());

            }
        });

        System.out.println(list);
    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate> {
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "" + getYear() + "-" + getMonth() + "-" + getDay();
    }

    @Override
    public int compareTo(MyDate o) {
        int i = this.year - o.year;
        if (i != 0) return i;
        i = this.month - o.month;
        if (i != 0) return i;
        return this.day - o.day;
    }
}
