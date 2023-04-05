package com.hspedu.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class _PrintWriter {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("hi hi hi ~~~");
        printWriter.close();

        PrintWriter printWriter1 = new PrintWriter(new FileWriter("C:\\javaio\\c.txt"));
        printWriter1.println("hi a b c ");
        printWriter1.close();
    }
}
