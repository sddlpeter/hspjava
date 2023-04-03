package com.hspedu.collection;

import java.util.LinkedHashSet;

public class _LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(new Car("au tuo", 1000));
        set.add(new Car("audi", 300000));
        set.add(new Car("fa la li", 1000000));
        set.add(new Car("audi", 300000));

        System.out.println(set);


    }
}

class Car {
    String name;
    double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int hashCode() {
        return (name + price).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Car car = (Car) obj;
        if (car.name.equals(this.name) && car.price == this.price) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}