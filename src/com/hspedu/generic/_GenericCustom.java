package com.hspedu.generic;

import java.util.Arrays;

public class _GenericCustom {
    public static void main(String[] args) {
        Monkey<String, Integer, Double> monkey = new Monkey("hello", "1", 10, 3.0);
        System.out.println(monkey);
    }
}

// T, R, M 是泛型的标识符，一般是单个大写字母
// 泛型的标识符可以有多个
// 普通成员可以使用泛型（属性，方法）


class Monkey<T, R, M> {
    String name;
    R r;
    M m;
    T t;
    T[] ts;

    public Monkey(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    // 因为静态成员和方法是和类相关的，在类加载时，对象还没有创建
    // 所以如果静态方法和属性使用了泛型，JVM就无法完成初始化
//    static R r1;
//    public static void m1(M m) {
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", m=" + m +
                ", t=" + t +
                ", ts=" + Arrays.toString(ts) +
                '}';
    }
}
