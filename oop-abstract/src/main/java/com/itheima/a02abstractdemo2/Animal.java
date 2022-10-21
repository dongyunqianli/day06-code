package com.itheima.a02abstractdemo2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Animal {
    private String name;
    private int age;



    public void drink(){
        System.out.println("is drinking");
    }
    public abstract void eat();
}
