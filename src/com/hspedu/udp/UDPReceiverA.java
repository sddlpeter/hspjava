package com.hspedu.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);

        System.out.println("接收端等待接收数据...");
        datagramSocket.receive(datagramPacket);


        //拆包
        int len = datagramPacket.getLength();
        byte[] data = datagramPacket.getData();
        String s = new String(data, 0, len);
        System.out.println(s);


        byte[] reply = "好的，明天见.".getBytes();
        DatagramPacket replyData = new DatagramPacket(reply, reply.length, InetAddress.getByName("10.0.0.218"), 9998);
        datagramSocket.send(replyData);


        datagramSocket.close();
    }
}
