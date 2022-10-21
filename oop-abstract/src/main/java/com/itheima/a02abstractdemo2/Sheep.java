package com.itheima.a02abstractdemo2;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
@AllArgsConstructor
public class Sheep extends Animal{
    @Override
    public void eat() {
        System.out.println("sheep is eating grass");
    }
}
