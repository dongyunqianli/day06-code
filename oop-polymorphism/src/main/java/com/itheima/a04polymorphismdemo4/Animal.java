package com.itheima.a04polymorphismdemo4;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    private int age;
    private String color;
    public void eat(String something){
        System.out.println("animal is eating"+something);
    }

}
