package com.itheima.a06interfacedemo6;

public class InterImpl implements InterA,InterB{
    @Override
    public void method() {

        System.out.println("getClass() = " + getClass());
    }

    @Override
    public void show() {
        InterA.super.show();
        System.out.println("InterB.class = " + InterB.class);
        InterB.super.show();

        System.out.println();
        System.out.println("InterA.super.getClass() = " + InterA.super.getClass());
        System.out.println("InterB.super.getClass() = " + InterB.super.getClass());
        System.out.println("重写接口中的默认方法");
    }
}
