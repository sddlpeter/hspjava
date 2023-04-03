package com.hspedu.io;

import java.io.File;
import java.io.IOException;

public class FileInformation {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\v-zhhao\\Git\\hello2.txt");
        // file.createNewFile();
        System.out.println("get name ----------- :" + file.getName());
        System.out.println("get absolute path ----------- :" + file.getAbsolutePath());
        System.out.println("get parent ----------- :" + file.getParent());
        System.out.println("get length ----------- :" + file.length());

        System.out.println("get 存在 ----------- :" + file.exists());
        System.out.println("get 文件 ----------- :" + file.isFile());
        System.out.println("get 目录 ----------- :" + file.isDirectory());

    }
}
