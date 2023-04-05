package com.hspedu.io;

import java.io.*;
import java.util.Properties;

public class Homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.setProperty("name", "tom");
        properties.setProperty("age", "5");
        properties.setProperty("color","red");
        FileWriter fileWriter = new FileWriter("src/dog.properties");
        properties.store(fileWriter, null);

        Dog dog = new Dog(properties.getProperty("name"), Integer.parseInt(properties.getProperty("age")));

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/dog.dat"));
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/dog.dat"));
        Object obj = objectInputStream.readObject();
        Dog newDog = (Dog) obj;
        System.out.println(newDog);


    }
}
