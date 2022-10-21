package com.itheima.a02abstractdemo2;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
@AllArgsConstructor
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("dog is eating meat");
    }
}
