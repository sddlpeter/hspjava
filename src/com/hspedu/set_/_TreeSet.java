package com.hspedu.set_;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class _TreeSet {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                return s1.length() - s2.length();
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("a");
        treeSet.add("cd");
        treeSet.add("wow");
        System.out.println(treeSet);
        HashSet set;
    }
}
