package com.hspedu.io;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory {
    public static void main(String[] args) {

    }

    @Test
    public void m1() {
        File file = new File("C:\\javaio\\news1.txt");
        if (file.exists()) {
            file.delete();
        }
    }


    // 目录也被当作文件对待
    @Test
    public void m2() {
        File file = new File("C:\\javaio");
        if (file.exists()) {
            System.out.println("文件路径存在，已删除");
            file.delete();
        } else {
            System.out.println("文件路径不存在");
        }
    }

    @Test
    public void m3() {
        File file = new File("C:\\javaio\\a\\b\\c");
        if (file.exists()) {
            System.out.println("文件存在");
        } else {
            System.out.println("文件不存在");
            if (file.mkdirs()) {
                System.out.println("文件已被创建");
            }
        }
    }
}
