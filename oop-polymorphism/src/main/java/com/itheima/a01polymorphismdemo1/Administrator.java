package com.itheima.a01polymorphismdemo1;

public class Administrator extends Person{
    @Override
    public void show() {
        System.out.println("Administrator information: "+getName()+", "+getAge());
    }
}
