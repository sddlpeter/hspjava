package com.hspedu.io;

import java.io.*;

public class _PrintStream {
    public static void main(String[] args) throws IOException {
//        OutputStream outputStream = new FileOutputStream("C:\\javaio\\Lily and the Feathered Friends.txt");
//        PrintStream printStream = new PrintStream(outputStream);
//        printStream.println();
//        printStream.close();
        PrintStream printStream = System.out;
        printStream.println("test");
        printStream.close();

        System.setOut(new PrintStream("C:\\javaio\\b.txt"));
        System.out.write("韩顺平教育~~".getBytes());


    }
}
