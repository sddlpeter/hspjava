package com.hspedu.properties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _Properties1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/mysql.properties"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] strs  = line.split("=");
            System.out.println(strs[0] + " " + strs[1]);
        }
        bufferedReader.close();
    }
}
