package com.hspedu.network;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("client is setup to connect to localhost with port 9999");
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello, World!");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        System.out.println("client write completed...");

        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        socket.shutdownInput();

        System.out.println("client read completed...");



        System.out.println("client closed...");

        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
    }
}
