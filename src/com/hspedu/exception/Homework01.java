package com.hspedu.exception;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {

    }

    public static int divide() {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String input2 = scanner.next();

        int res = 0;
        try {
            int n1 = Integer.parseInt(input1);
            int n2 = Integer.parseInt(input2);

            res = n1 / n2;
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

        System.out.println(res);
        return 0;
    }
}


