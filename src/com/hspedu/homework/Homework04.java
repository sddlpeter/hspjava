package com.hspedu.homework;

public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new ICalculator() {
            @Override
            public double work(double d1, double d2) {
                return d1 + d2;
            }
        }, 10, 8);
    }
}

interface ICalculator {
    public double work(double d1, double d2);
}

class Cellphone {
    public void testWork(ICalculator calculator, double d1, double d2) {
        double result = calculator.work(d1, d2);
        System.out.println(result);
    }
}
