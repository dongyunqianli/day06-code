package com.itheima.a01polymorphismdemo1;

public class Student extends Person{

    public Student(){
        super();
    }

    public Student(String name, int age) {
        this();
        super.setName(name);
        super.setAge(age);
    }

    @Override
    public void show() {
        System.out.println("student information: "+getName()+", "+getAge());
    }
}
