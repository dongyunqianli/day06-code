package com.itheima.a01staticdemo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private int age;
    private String gender;
    public static String teacherName;

    public void study(){
        System.out.println(name+" is studying");
    }
    public void show(){
        System.out.println(name+", "+age+", "+gender+", "+teacherName);
    }
}
