package com.hspedu.collection;

import java.util.Hashtable;

public class _HashtableTest {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();

        table.put("no1", "john");
        table.put("no2", "alice");
        // table.put(null, "tom");
        // table.put("no3", null);
        table.put("no1", "bob");

        System.out.println(table);
    }
}
