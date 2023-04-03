package com.hspedu.scanner_;

public class Homework01 {
    public static void main(String[] args) {
        checkTimes();
    }

    public static void checkNum(int val) {
        if (val < 0) {
            System.out.println(val + " is < 0");
        } else if (val > 0) {
            System.out.println(val + " is > 0");
        } else {
            System.out.println(val + " is = 0");
        }
    }

    public static void checkTimes() {
        int val = 100000;
        int n = 0;

        while (val > 0) {
            if (val > 50000) {
                val = (int) (val - val * 0.05);
            } else {
                val = val - 1000;
            }
            n++;
        }
        System.out.println("total time count: " + n);
    }
}
