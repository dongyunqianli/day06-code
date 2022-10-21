package com.itheima.test;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1=new Student("zhangsan1",21);
        Student s2=new Student("zhangsan2",22);
        Student s3=new Student("zhangsan3",23);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println("stu.getName() = " + stu.getName());
            System.out.println("stu.getAge() = " + stu.getAge());
        }
    }
}
