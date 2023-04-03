package com.hspedu.poly_.exercise;

public class PolyExercise02 {
    public static void main(String[] args) {
        // 等号左边是编译类型，等号右边是运行类型
        // 属性看编译类型，方法看运行类型
        Sub s = new Sub();
        System.out.println(s.count);
        s.display();

        Base b = s;
        System.out.println(b == s);
        System.out.println(b.count);
        b.display();
    }
}

class Base {
    int count = 10;
    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base {
    int count = 20;
    public void display() {
        System.out.println(this.count);
    }
}
