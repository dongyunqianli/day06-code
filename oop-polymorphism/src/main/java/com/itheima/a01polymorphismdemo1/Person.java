package com.itheima.a01polymorphismdemo1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;

    public void show(){
        System.out.println(name+", "+age);
    }
}
