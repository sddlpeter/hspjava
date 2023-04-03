package com.hspedu.io;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\v-zhhao\\Git\\hello.txt";
        File newFile1 = new File(filePath);
        if (newFile1.createNewFile()) {
            System.out.println("创建成功");
        } else {
            System.out.println("创建失败");
        }
    }

    @Test
    public void create2() throws IOException {
        File file = new File("C:\\Users\\v-zhhao\\Git\\");
        String fileName = "news2.txt";
        File newFile2 = new File(file, fileName);
        if (newFile2.createNewFile()) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }

    @Test
    public void create3() throws IOException {
        String parent = "C:\\Users\\v-zhhao\\Git";
        String child = "news3.txt";
        File file = new File(parent,child);
        if (file.createNewFile()) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }
}
