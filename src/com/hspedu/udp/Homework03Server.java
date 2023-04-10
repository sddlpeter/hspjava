package com.hspedu.udp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Homework03Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("server is started...");
        Socket socket = serverSocket.accept();

        Map<String, String> dict = new HashMap<>();
        dict.put("cat", "c:\\javaio\\cat.jpg");
        dict.put("dog", "c:\\javaio\\dog.jpg");
        dict.put("koala", "c:\\javaio\\koala.jpg");
        dict.put("panda", "c:\\javaio\\panda.jpg");

        String defaultPic = "c:\\javaio\\error.jpg";

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(isr);

        String word = br.readLine();

        String path = "";

        if (dict.containsKey(word)) {
            path = dict.get(word);
        } else {
            path = defaultPic;
        }

        System.out.println(path);
        FileInputStream fis = new FileInputStream(path);
        OutputStream os = socket.getOutputStream();

        int len = 0;
        byte[] data = new byte[1024];
        while ((len = fis.read(data)) != -1) {
            os.write(data);
        }
        os.flush();
        socket.shutdownOutput();

    }
}
