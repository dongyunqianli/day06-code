package com.itheima.a01interfacedemo1;



public class Dog extends Animal implements Swim{


    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(int age) {
        super(age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("dog is eating bone.");
    }

    @Override
    public void swim() {
        System.out.println("dog is swimming.");

    }
}
