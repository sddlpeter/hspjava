package com.hspedu.poly_.detail_;

public class PolyDetail02 {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println(base.count);
    }
}


class Base {
    int count = 10;
}

class Sub extends Base {
    int count = 20;
}