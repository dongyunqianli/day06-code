package com.itheima.a04objectdemo;

import com.google.gson.Gson;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Objects;

public class ObjectDemo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //toString()
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println("str1 = " + str1);
        //equals()
        System.out.println("str1.equals(str1) = " + str1.equals(str1));
        //clone()
        Student stu1 = new Student();
        Student stu2 = (Student)stu1.clone();


        Gson gson = new Gson();
        String s = gson.toJson(stu1);
        Student student = gson.fromJson(s, Student.class);


        Objects.equals(stu1,student);
        Objects.isNull(stu2);
        Student s4 = null;
        Objects.nonNull(s4);

    }
}
