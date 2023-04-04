package com.hspedu.io;

import java.io.FileWriter;
import java.io.IOException;

public class _FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\javaio\\note.txt");
        fileWriter.write("张三");
        fileWriter.write('H');
        char[] chars = {'a','b','c'};
        fileWriter.write(chars);
        fileWriter.write("韩顺平教育".toCharArray(), 0, 3);
        fileWriter.write("上海天津", 0, 2);


        System.out.println("程序已经写入完成");
        fileWriter.close();
    }
}
