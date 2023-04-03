package com.hspedu.innerclass;

public class InnerClassExercise {
    public static void main(String[] args) {
        // 匿名内部类当作实参直接传递，简洁高效
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一副眼镜...");
            }
        });

        // 传统方式
        f1(new Picture());
    }

    // 静态方法，形参是接口类型
    public static void f1(IL il ) {
        il.show();
    }
}

interface IL {
    public void show();
}


// 类 实现IL  => 编程领域（硬编码）
class Picture implements IL {

    @Override
    public void show() {
        System.out.println("这是一副眼镜");
    }
}
