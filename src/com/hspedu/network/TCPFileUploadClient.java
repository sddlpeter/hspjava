package com.hspedu.network;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

        String filePath = "c:\\javaio\\koala-small.jpg";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bos.flush();
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        String s = StreamUtils.streamToString(inputStream);

        // BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(s);

        inputStream.close();
        bis.close();
        bos.close();
        socket.close();


    }
}
