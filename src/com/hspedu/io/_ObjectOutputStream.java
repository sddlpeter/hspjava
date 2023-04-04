package com.hspedu.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class _ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\javaio\\data.dat"));
        objectOutputStream.writeInt(100);
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeDouble(98.1);
        objectOutputStream.writeChar('c');
        objectOutputStream.writeObject(new Dog("Tom", 4));

        objectOutputStream.close();
    }
}
