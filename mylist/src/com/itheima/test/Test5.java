package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s=new Student();
            System.out.println("please input student's name: ");
            String name=sc.next();
            System.out.println("please input student's age: ");
            int age=sc.nextInt();
            s.setName(name);
            s.setAge(age);
            list.add(s);
        }
        System.out.println("list.size() = " + list.size());
    }
}
