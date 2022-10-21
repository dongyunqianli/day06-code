package com.itheima.lambdademo;

public class LambdaDemo2 {
    public static void main(String[] args) {


        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳...");
            }
        });
        method(()->System.out.println("is playing..."));
    }
    public static void method(Swim s){
        s.swimming();
    }
}
interface Swim{
    public abstract void swimming();
}
