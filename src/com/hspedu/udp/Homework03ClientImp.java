package com.hspedu.udp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Homework03ClientImp {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        System.out.println("client started...");

        System.out.println("请输入： ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("您输入的是： " + input);


        OutputStream os = socket.getOutputStream();
        os.write(input.getBytes());

        socket.shutdownOutput();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] image = StreamUtils.streamToByteArray(bis);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:\\javaio\\copy\\" + input + ".jpg"));
        bos.write(image);

        bos.flush();

        System.out.println("client exit...");
    }
}
