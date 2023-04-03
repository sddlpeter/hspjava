package com.hspedu.wrapper;

public class WrapperVsString {
    public static void main(String[] args) {
        Integer i = 100;
        String s1 = i + "";
        String s2 = i.toString();
        String s3 = String.valueOf(i);


        String s = "1234";
        Integer i4 = Integer.parseInt(s); //使用到自动装箱
        Integer i5 = Integer.valueOf(s);
    }
}
