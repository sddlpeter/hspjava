package com.hspedu.collection;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("john", 100);
        // Properties类继承了Hashtable类，所以也不能在k-v里存放null
//        properties.put(null, 100);
//        properties.put("john", null);
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 88);

        System.out.println(properties);
    }
}
