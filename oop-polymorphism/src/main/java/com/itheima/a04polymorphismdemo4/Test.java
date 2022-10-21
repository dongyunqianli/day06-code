package com.itheima.a04polymorphismdemo4;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("老王", 30);
        Dog d = new Dog(2, "black");
        Cat c = new Cat(3,"gray");

        p.keepPet(d,"bone");
        p.keepPet(c,"fish");
    }
}
