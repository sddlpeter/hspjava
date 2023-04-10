package com.hspedu.udp;

import java.io.IOException;
import java.net.*;

public class Homework02ReceiverA {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);

        System.out.println("接收方启动...");
        byte[] data = new byte[1024];
        DatagramPacket packet = new DatagramPacket(data, data.length);

        socket.receive(packet);

        int len = packet.getLength();
        byte[] msg = packet.getData();
        String message = new String(msg, 0, len);
        String ans = "";
        if ("四大名著是哪些".equals(message)) {
            ans = "《西游戏》， 《红楼梦》， 《三国演义》， 《水浒传》";
        } else {
            ans = "what?";
        }

        byte[] reply = ans.getBytes();

        packet = new DatagramPacket(reply, reply.length, InetAddress.getByName("10.0.0.218"), 8887);
        socket.send(packet);

        System.out.println("接收方退出...");
    }
}
