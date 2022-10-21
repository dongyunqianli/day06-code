package com.itheima.a01interfacedemo1;



public class Frog extends Animal implements Swim{


    public Frog(String name, int age) {
        super(name, age);
    }

    public Frog(String name) {
        super(name);
    }

    public Frog(int age) {
        super(age);
    }

    public Frog() {
    }

    @Override
    public void eat() {
        System.out.println("frog is eating bug.");
    }

    @Override
    public void swim() {
        System.out.println("frog is swimming.");

    }
}
