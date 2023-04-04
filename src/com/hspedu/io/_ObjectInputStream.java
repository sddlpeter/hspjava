package com.hspedu.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class _ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\javaio\\data.dat"));
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readDouble());
        System.out.println(objectInputStream.readChar());
        Object obj = objectInputStream.readObject();
        Dog dog = (Dog) obj;
        System.out.println(dog.getClass());
        System.out.println(dog.toString());
    }
}
