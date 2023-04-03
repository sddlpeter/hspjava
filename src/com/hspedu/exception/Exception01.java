package com.hspedu.exception;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int[] nums = new int[5];
        nums[5] = 100;

        try {
            int res = num1/num2;
        } catch (Exception e) {
            // throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        System.out.println("程序继续执行...");


    }
}
