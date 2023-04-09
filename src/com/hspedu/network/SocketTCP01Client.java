package com.hspedu.network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        // 链接本机的9999号端口，如果链接成功返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket返回=" + socket.getClass());

        // 得到和socket对象关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, Server".getBytes());
        socket.shutdownOutput();
        outputStream.close();

        socket.close();

        System.out.println("客户端退出了");
    }
}
