package com.itheima.a01interfacedemo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
//@NoArgsConstructor
@AllArgsConstructor
public abstract class Animal {
    private String name;
    private int age;

//    public Animal(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
    public Animal(String name){
        this.name=name;
    }
    public Animal(int age){
        this.age=age;
    }
    public Animal(){

    }
    public abstract void eat();

}
