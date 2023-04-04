package com.hspedu.io;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\javaio\\Lily and the Feathered Friends.txt");
        int data;
        while ((data = fileReader.read()) != -1) {
            System.out.print((char) data);
        }
        System.out.println();
        System.out.println("------- end ------");
        fileReader.close();
    }

    @Test
    public void m1() throws IOException {
        FileReader fileReader = new FileReader("C:\\javaio\\Lily and the Feathered Friends.txt");
        char[] buffer = new char[32];
        int len;
        while ((len = fileReader.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, len));
        }
        System.out.println();
        System.out.println("------------ end -------------");
        fileReader.close();
    }
}
