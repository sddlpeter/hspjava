package com.hspedu.homework;

import java.sql.SQLOutput;

public class Homework08 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
        switch (green) {
            case GREEN:
                System.out.println("匹配到绿色");
                break;
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case RED:
                System.out.println("匹配到红色");
                break;
            default:
                System.out.println("没有匹配到颜色");
        }

    }
}


enum Color implements IShowColor {
    RED(255,0,0),BLUE(0,0,255),BLACK(0,0,0),YELLOW(255,255,0),GREEN(0,255,0);
    int redVal, greenVal, blueVal;
    Color(int r, int g, int b) {
        this.redVal = r;
        this.greenVal = g;
        this.blueVal = b;
    }

    @Override
    public void show() {
        System.out.println(redVal + " " + greenVal + " " + blueVal);
    }
}

interface IShowColor {
    public void show();
}