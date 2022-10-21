package com.itheima.a01polymorphismdemo1;

public class Teacher extends Person{
    public Teacher(String name, int age) {
        super.setName(name);
        super.setAge(age);
    }
    @Override
    public void show() {
        System.out.println("teacher information: "+getName()+", "+getAge());
    }
}
