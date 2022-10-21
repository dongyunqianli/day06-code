package com.itheima.a06interfacedemo6;

public interface InterB {

    public default void show(){
        System.out.println("default method in interface---InterB---- show");
        System.out.println("getClass() = " + this.getClass());

    }
}
