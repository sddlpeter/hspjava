package com.hspedu.udp;


import org.junit.platform.commons.util.StringUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Homework03ServerImp {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("server started...");
        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();
        int len = 0;
        byte[] data = new byte[1024];
        String input = "";
        while ((len = is.read(data)) != -1) {
            input = input + new String(data, 0, len);
        }
        System.out.println(input);

        String filePath = "";
        if ("dog".equals(input)) {
            filePath = "src/dog.jpg";
        } else if ("cat".equals(input)) {
            filePath = "src/cat.jpg";
        } else if ("panda".equals(input)) {
            filePath = "src/panda.jpg";
        } else {
            filePath = "src/koala.jpg";
        }

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        byte[] image = StreamUtils.streamToByteArray(bis);

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(image);

        bos.flush();

        socket.shutdownOutput();


        System.out.println("server exit...");
    }
}
