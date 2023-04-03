package com.hspedu.string_;

public class StringBufferExercise02 {
    public static void main(String[] args) {
        String price = "123456.78";
        StringBuffer sb = new StringBuffer(price);

        System.out.println(sb.lastIndexOf("."));
    }
}
