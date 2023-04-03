package com.hspedu.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _FileOutputStream {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\javaio\\hello.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(filePath, true);
        fileOutputStream.write('h');
        fileOutputStream.write("children".getBytes(), 0, 5);
        fileOutputStream.close();
    }
}
