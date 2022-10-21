package com.itheima.test;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.brand="小米";
        p.price=19999.98;
        System.out.println("p.brand = " + p.brand);
        System.out.println("p.price = " + p.price);
        p.call();
        p.playGame();
    }
}
