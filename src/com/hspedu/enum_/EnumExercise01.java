package com.hspedu.enum_;

public class EnumExercise01 {
    public static void main(String[] args) {
        Gender boy = Gender.BOY;
        Gender boy2 = Gender.BOY;
        System.out.println(boy);
        System.out.println(boy == boy2);
        Enum e;
    }
}

enum Gender {
    BOY, GIRL;
}
