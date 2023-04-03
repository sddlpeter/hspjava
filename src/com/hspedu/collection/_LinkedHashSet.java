package com.hspedu.collection;
import java.util.LinkedHashSet;

@SuppressWarnings("all")
public class _LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("liu", 2315));
        set.add(123);
        set.add("HSP");
        System.out.println("set = " + set);
    }
}

class Customer {
    String name;
    int id;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
