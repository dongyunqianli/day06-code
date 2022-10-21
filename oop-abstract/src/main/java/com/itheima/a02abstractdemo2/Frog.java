package com.itheima.a02abstractdemo2;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
@AllArgsConstructor
public class Frog extends Animal{

//    private int a;

    public Frog(String name, int age) {
        super(name, age);
    }

//    public Frog(String name, int age, int a) {
//        super(name, age);
//        this.a = a;
//    }
//
//    public Frog(int a) {
//        this.a = a;
//    }

//    public Frog(){}



    @Override
    public void eat() {
        System.out.println("frog is eating bug.");
    }
}
