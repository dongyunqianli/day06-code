package com.itheima.a08interfacedemo8;

public interface InterA {
    public default void show1(){
        System.out.println("show1 method execute...");
        show5();
    }
    public default void show2(){
        System.out.println("show1 method execute...");
        show5();
    }
    public static void show3(){
        System.out.println("show1 method execute...");
        show6();
    }
    public static void show4(){
        System.out.println("show1 method execute...");
        show6();
    }
    default void show5(){
        System.out.println("show1 method execute...");

    }
    static void show6(){
        System.out.println("show1 method execute...");

    }
}
