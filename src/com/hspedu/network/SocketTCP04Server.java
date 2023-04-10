package com.hspedu.network;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP04Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("server started, waiting for connect...");
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream("src/koala.jpg");

        byte[] buf = new byte[1024];
        while ((inputStream.read(buf)) != -1) {
            fileOutputStream.write(buf);
        }

        fileOutputStream.flush();

        fileOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
