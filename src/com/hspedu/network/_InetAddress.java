package com.hspedu.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class _InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        InetAddress host2 = InetAddress.getByName("HaoT480");
        System.out.println(host2);

        InetAddress host3 = InetAddress.getByName("www.google.com");
        System.out.println(host3);

        String host3Name = host3.getHostName();
        System.out.println(host3Name);

        String host3Address = host3.getHostAddress();
        System.out.println(host3Address);

    }
}
