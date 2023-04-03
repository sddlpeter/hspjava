package com.hspedu.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework01 {
    public static void main(String[] args) {
        DAO<User> dao = new DAO();
        dao.save("123", new User(123, 20, "Tom"));
        dao.save("456", new User(456, 22, "Mary"));
        dao.save("789", new User(789, 18, "Alice"));

//        System.out.println(dao.get("123"));
//        dao.update("123", new User(123, 28, "Tom"));
//        System.out.println(dao.get("123"));
//
//        System.out.println(dao.list());
//
//        dao.delete("456");
//        System.out.println(dao.list());
        dao.get("123", 123);
    }
}

class DAO<T> {
    Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public <E> T get(String id) {
        return map.get(id);
    }

    public <E> T get(String id, E e) {
        System.out.println(e.getClass());
        return map.get(id);
    }
    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public <E> List<T> list() {
        List<T> list = new ArrayList<>();

        for (T t : map.values()) {
            list.add(t);
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}