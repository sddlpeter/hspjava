package com.hspedu.udp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Homework03ClientImp {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        System.out.println("client started...");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("您输入的是： " + input);
        OutputStream os = socket.getOutputStream();
        os.write(input.getBytes());
        os.flush();




        System.out.println("client exit...");
    }
}
