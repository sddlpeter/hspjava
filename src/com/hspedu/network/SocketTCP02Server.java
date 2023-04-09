package com.hspedu.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        // 在本机9999端口监听，要求此端口没有被占用
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待链接...");
        // 如果有客户端链接，则返回socket对象
        // 没有客户端链链接时，程序会阻塞，等待链接
        Socket socket = serverSocket.accept();
        System.out.println("服务器端socket=" + socket.getClass());

        // 通过socket输入流，读取客户端的数据
        InputStream inputStream = socket.getInputStream();
        int len = 0;
        byte[] buffer = new byte[1024];
        while ((len = inputStream.read(buffer)) != -1) {
            String line = new String(buffer, 0, len);
            System.out.println(line);
        }

        System.out.println("客户端消息接收完毕~~~");


        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("服务器：hello, Client!".getBytes());
        socket.shutdownOutput();

        inputStream.close();
        socket.close();
        serverSocket.close();

        System.out.println("服务器端退出");
    }
}
