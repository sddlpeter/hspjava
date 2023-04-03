package com.hspedu.enum_;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING.toString());
    }
}


class Season {
    String name;
    String desc;

    public final static Season SPRING = new Season("Spring", "Warm");
    public final static Season SUMMER = new Season("summer", "hot");
    public final static Season AUTUMN = new Season("autumn", "cool");
    public final static Season WINTER = new Season("winter", "cold");


    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return name + " " + desc;
    }
}