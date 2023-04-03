package com.hspedu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _FileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\v-zhhao\\Git\\IsIncreaseInUserUseLogic.txt");
//        int read;
//        while ((read = fileInputStream.read()) != -1) {
//            System.out.print((char) read);
//        }
//
//        System.out.println("\n=================");

        byte[] b = new byte[8];
        int len;
        while ((len = fileInputStream.read(b)) != -1) {
            System.out.print(new String(b, 0, len));
        }
        System.out.println("\n=================");

        fileInputStream.close();
    }
}
