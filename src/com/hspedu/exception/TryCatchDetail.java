package com.hspedu.exception;

public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String s = "a23";
            int a = Integer.parseInt(s);
            System.out.println("a = " + a);
            System.out.println("hello");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally 代码块被执行");
        }

        System.out.println("程序继续");
    }
}
