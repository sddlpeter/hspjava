package com.hspedu.udp;


import com.hspedu.network.StreamUtils;
import org.junit.platform.commons.util.StringUtils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Homework03ServerImp {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("server started...");
        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1) {
            String s = new String(bytes, 0, len);
            System.out.println("get from client: " + s);
        }

        System.out.println("server exit...");
    }
}
