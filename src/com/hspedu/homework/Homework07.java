package com.hspedu.homework;

public class Homework07 {
    public static void main(String[] args) {
        Car car1 = new Car(60);
        car1.getAir().flow();
        Car car2 = new Car(-1);
        car2.getAir().flow();
    }
}

class Car {
    double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class AirConditioner {
        public void flow() {
            if (temperature < 0) {
                System.out.println("吹暖气...");
            } else if (temperature > 40) {
                System.out.println("吹冷气...");
            } else {
                System.out.println("不工作...");
            }
        }
    }

    public AirConditioner getAir() {
        return new AirConditioner();
    }
}


