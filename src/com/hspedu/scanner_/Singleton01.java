package com.hspedu.scanner_;

public class Singleton01 {
    public static void main(String[] args) {
        Singleton.getSingleton();
    }
}

class Singleton {
    static Singleton singleton = new Singleton();
    private Singleton() {

    }
    public static Singleton getSingleton(){
        return singleton;
    }


}