package com.hspedu.io;

import java.io.*;

public class _FileCopy {
    public static void main(String[] args) throws IOException {
        File koala = new File("C:\\javaio\\koala.jpg");
        File copy = new File("C:\\Users\\v-zhhao\\Git\\koala.jpg");
        FileInputStream fileInputStream = new FileInputStream(koala);
        FileOutputStream fileOutputStream = new FileOutputStream(copy);
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fileInputStream.read(buffer)) != -1) {
            System.out.println(buffer);
            fileOutputStream.write(buffer, 0, len);
        }
        System.out.println();

        fileInputStream.close();
        fileOutputStream.close();

    }
}
