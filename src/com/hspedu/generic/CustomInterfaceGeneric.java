package com.hspedu.generic;

public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}
interface IUsb<U, R> {
    int n = 10;
    //  U name; // 在接口中，所有的成员都是静态的
    R get(U u);
    void hi(R r);
    void run(R r1, R r2, U u1, U u2);
    default R method(U u) {
        return null;
    }
}

interface IA extends IUsb<String, Double> {

}


// 当实现IA接口时，因为IA在继承IUsb接口时，指定了U为String，R为Double
// 在实现iUsb方法时，使用String替换替换U，使用Double替换R
class AA implements IA {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}

class C implements IUsb<String, Integer>{

    @Override
    public Integer get(String s) {
        return null;
    }

    @Override
    public void hi(Integer integer) {

    }

    @Override
    public void run(Integer r1, Integer r2, String u1, String u2) {

    }
}


// 如果不指定泛型类型，则默认用Object替换原来的泛型
class DD implements IUsb {

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}