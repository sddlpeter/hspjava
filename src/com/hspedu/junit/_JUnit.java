package com.hspedu.junit;

import org.junit.jupiter.api.Test;

public class _JUnit {
    public static void main(String[] args) {

        new _JUnit().m1();
        new _JUnit().m2();

    }

    @Test
    public void m1() {
        System.out.println("m1 方法被调用");
    }

    @Test
    public void m2() {
        System.out.println("m2 方法被调用");

    }
}


