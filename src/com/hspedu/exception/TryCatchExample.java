package com.hspedu.exception;

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入一个整数: ");
            String input = scanner.next();
            try {
                int num = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("您输入的不是整数！");
                System.out.println();
            }
        }
        System.out.println("输入成功，程序退出...");

    }
}
