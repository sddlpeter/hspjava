package com.hspedu.io;

import java.io.*;

public class Homework01 {
    public static void main(String[] args) throws IOException {
        File file = new File("c:\\javaio\\mytemp");
        file.mkdirs();

        file = new File("c:\\javaio\\mytemp\\hello.txt");
        if (file.createNewFile()) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write("韩顺平教育~~~");
        bufferedWriter.close();
    }
}
