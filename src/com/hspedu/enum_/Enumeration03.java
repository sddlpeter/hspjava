package com.hspedu.enum_;

public class Enumeration03 {
    public static void main(String[] args) {

    }
}

enum Season2 {


//    public final static Season SPRING = new Season("Spring", "Warm");
//    public final static Season SUMMER = new Season("summer", "hot");
//    public final static Season AUTUMN = new Season("autumn", "cool");
//    public final static Season WINTER = new Season("winter", "cold");
    SPRING("春天", "温暖");
    private String name;
    private String desc;


    private Season2(String name, String desc) {
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