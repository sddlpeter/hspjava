package com.hspedu.udp;

import java.io.IOException;
import java.net.*;

public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9998);
        byte[] data = "hello, 明天吃火锅~~".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length, InetAddress.getByName("10.0.0.218"), 9999);
        datagramSocket.send(datagramPacket);

        byte[] reply = new byte[1024];
        DatagramPacket replyData = new DatagramPacket(reply, reply.length);
        datagramSocket.receive(replyData);


        String replyMessage = new String(replyData.getData(), 0, replyData.getLength());
        System.out.println(replyMessage);

        datagramSocket.close();
    }
}
