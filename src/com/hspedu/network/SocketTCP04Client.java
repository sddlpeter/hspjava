package com.hspedu.network;

import org.junit.platform.commons.util.StringUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTCP04Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        String filePath = "C:\\javaio\\koala-small.jpg";
        FileInputStream fileInputStream = new FileInputStream(filePath);

        OutputStream outputStream = socket.getOutputStream();
        byte[] buf = new byte[1024];
        while ((fileInputStream.read(buf)) != -1) {
            outputStream.write(buf);
        }

        outputStream.flush();
        outputStream.close();
        fileInputStream.close();
        socket.close();
    }
}
