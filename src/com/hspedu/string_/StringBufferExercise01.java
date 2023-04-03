package com.hspedu.string_;

public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());

        System.out.println(sb);

        StringBuffer sb1 = null;
        try {
            sb1 = new StringBuffer(str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(sb1);
    }
}
