package com.itheima.a04polymorphismdemo4;

public class Cat extends Animal{
    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }

    @Override
    public void eat(String something) {
        System.out.printf("{%s}岁{%s}猫，猛吃{%s}",getAge(),getColor(),something);
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
