package com.hspedu.properties;

import java.io.*;
import java.util.Properties;

public class _Properties2 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src/mysql.properties"));
        System.out.println(properties.get("ip"));

        properties.store(new FileOutputStream("src/mysqlconfig.properties"), null);
    }
}
