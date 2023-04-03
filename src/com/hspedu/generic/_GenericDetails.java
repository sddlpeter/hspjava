package com.hspedu.generic;

import java.util.ArrayList;
import java.util.List;

public class _GenericDetails {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // List<int> lst = new List<int>();

        Pig<A> aPig = new Pig<A>(new A());
        Pig<A> aPig2 = new Pig<A>(new B());

        aPig.f();
        aPig2.f();

        // 如果没有指定泛型类型，默认就是object类型
        List list4 = new ArrayList();
        List<Pig> list5 = new ArrayList<>();




        Tiger tiger = new Tiger();

        /*
            class Tiger<E> {
                Object e;
                public Tiger() {
                }
                public Tiger(Object e) {
                    this.e = e;
                }
            }
         */

    }
}


class Tiger<E> {
    E e;
    public Tiger() {
    }
    public Tiger(E e) {
        this.e = e;
    }
}

class A {}
class B extends A {
    String s;
}

class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public void f() {
        System.out.println(e.getClass());
    }
}