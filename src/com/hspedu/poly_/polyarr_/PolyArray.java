package com.hspedu.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Joe", 20);
        persons[1] = new Student("Jack", 18, 100);
        persons[2] = new Student("Smith", 18, 90);
        persons[3] = new Teacher("scott", 30, 20000);
        persons[4] = new Teacher("King", 50, 25000);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student) {
                ((Student) persons[i]).study();
            }
            if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();
            }
        }

        System.out.println(persons[0].toString());
    }
}
