package com.hspedu.io;

import java.io.*;

public class Homework02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\javaio\\Lily and the Feathered Friends.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c:\\javaio\\lily story.txt"));
        String line;
        int i = 1;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(i + " " + line);
            bufferedWriter.write(i++ + " " + line);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
