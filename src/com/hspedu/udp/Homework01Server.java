package com.hspedu.udp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Homework01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("server端启动，监听端口9999...");
        Socket socket = serverSocket.accept();

        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(inputStreamReader);

        String input = br.readLine();
        String reply = null;
        if (input.equals("name")) {
            reply = "我是nova";
        } else if (input.equals("hobby")) {
            reply = "编写java程序";
        } else {
            reply = "你说啥呢";
        }

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
        BufferedWriter bw = new BufferedWriter(outputStreamWriter);

        bw.write(reply);
        bw.newLine();
        bw.flush();

        bw.close();
        socket.close();
        serverSocket.close();
    }
}
