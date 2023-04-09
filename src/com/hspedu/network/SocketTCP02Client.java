package com.hspedu.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        // 链接本机的9999号端口，如果链接成功返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket返回=" + socket.getClass());

        System.out.println("发送消息给服务器端");
        // 得到和socket对象关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("客户端：hello, Server".getBytes());
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(buffer)) != -1) {
            String line = new String(buffer, 0, len);
            System.out.println(line);
        }

        outputStream.close();
        socket.close();
        System.out.println("客户端退出了");
    }
}
