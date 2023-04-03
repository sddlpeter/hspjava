package com.hspedu.homework;

public class Homework06 {
    public static void main(String[] args) {
        Person tang = new Person("tang seng", new Horse());
        tang.common();
        tang.passRiver();
        tang.common();
        tang.passFire();
        tang.common();
    }
}


interface IVehicle {
    String name = "";
    public void work();
}

class Horse implements IVehicle {
    String name = "horse";
    @Override
    public void work() {
        System.out.println("一般情况下，使用马儿前行");
    }
}

class Boat implements IVehicle {
    String name = "boat";
    @Override
    public void work() {
        System.out.println("遇见河流，使用船过河");
    }
}

class Plane implements IVehicle {
    String name = "plane";

    @Override
    public void work() {
        System.out.println("遇见火焰山，坐飞机过去");
    }
}

class Factory {
    public static Boat getBoat() {
        return new Boat();
    }

    public static Horse getHorse() {
        return new Horse();
    }

    public static Plane getPlane() {
        return new Plane();
    }
}

class Person {
    String name;
    IVehicle vehicle;

    public Person(String name, IVehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public void passRiver() {
        if (!(vehicle instanceof Boat)) {
            vehicle = Factory.getBoat();
        }
        vehicle.work();
    }

    public void common() {
        if (!(vehicle instanceof Horse)) {
            vehicle = Factory.getHorse();
        }
        vehicle.work();
    }

    public void passFire() {
        if (!(vehicle instanceof Plane)) {
            vehicle = Factory.getPlane();
        }
        vehicle.work();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IVehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return this.name;
    }
}