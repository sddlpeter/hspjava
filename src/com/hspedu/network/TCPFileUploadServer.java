package com.hspedu.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("server port 8888, waiting for connect");

        Socket socket = serverSocket.accept();
        String filePath = "src/koala-copy.jpg";

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        bos.write(bytes);
        bos.flush();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("Server说：收到图片");
        bw.newLine();

        bw.flush();
        socket.shutdownOutput(); // 结束标记

        bw.close();
        bos.close();
        bis.close();
        socket.close();
        serverSocket.close();
    }
}
