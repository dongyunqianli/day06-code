package com.itheima.a06interfacedemo6;

public interface InterA {
    public abstract void method();

    public default void show(){
        System.out.println("default method in interface InterA---- show");
    }
}
