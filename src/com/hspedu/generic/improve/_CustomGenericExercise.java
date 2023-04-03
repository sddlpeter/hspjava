package com.hspedu.generic.improve;

public class _CustomGenericExercise {
    public static void main(String[] args) {

        // T = Double, R = String, M = Integer
        Truck<Double, String , Integer> g = new Truck<>("John");
        g.setT(10.9);
        // g.setT("yy"); // 错误，类型不对
        System.out.println(g);
        Truck g2 = new Truck("john~~"); // T = Object, R = Object, M = Object
        g2.setT("yy");
        System.out.println(g2);

    }
}

class Truck<T, R, M> {
    String name;
    T t;
    R r;
    M m;
    public Truck(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}