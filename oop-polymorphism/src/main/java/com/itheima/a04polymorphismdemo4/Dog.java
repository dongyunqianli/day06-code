package com.itheima.a04polymorphismdemo4;

public class Dog extends Animal{
    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }

    @Override
    public void eat(String something) {
        System.out.printf("{%s}岁{%s}狗，猛吃{%s}",getAge(),getColor(),something);
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}
