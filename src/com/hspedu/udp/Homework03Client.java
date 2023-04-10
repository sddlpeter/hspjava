package com.hspedu.udp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Homework03Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您想要的图片： ");
        String ask = scanner.next();

        OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write(ask);
        bw.newLine();
        bw.flush();

        InputStream is = socket.getInputStream();
        String path = "src/" + ask + ".jpg";
        FileOutputStream fos = new FileOutputStream(path);

        int len = 0;
        byte[] data = new byte[1024];
        while ((len = is.read(data)) != -1) {
            fos.write(data);
        }

        System.out.println("copy is completed...");

    }
}
