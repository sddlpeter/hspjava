package com.hspedu.udp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Homework01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
        BufferedWriter bw = new BufferedWriter(outputStreamWriter);

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的问题：");

        String word = scanner.next();

        System.out.println("客户端对server端说：" + word);
        bw.write(word);
        bw.newLine();

        bw.flush();

        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(inputStreamReader);

        String reply = br.readLine();
        System.out.println(reply);

        socket.close();
    }
}
