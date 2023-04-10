package com.hspedu.udp;

import java.io.IOException;
import java.net.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Homework02SenderB {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8887);
        System.out.println("请输入您的问题：");
        //四大名著是哪些
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        byte[] message = s.getBytes();
        DatagramPacket packet = new DatagramPacket(message, message.length, InetAddress.getByName("10.0.0.218"), 8888);
        socket.send(packet);

        packet = new DatagramPacket(new byte[1024], 1024);
        socket.receive(packet);

        int len = packet.getLength();
        byte[] msg = packet.getData();
        String data = new String(msg, 0, len);
        System.out.println(data);

        System.out.println("发送方退出...");
    }
}
