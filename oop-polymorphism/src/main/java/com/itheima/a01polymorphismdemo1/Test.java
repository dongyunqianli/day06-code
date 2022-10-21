package com.itheima.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {

        Student student = new Student();
        register(student);

        Student s = new Student("张三",18);

        Teacher t = new Teacher("王建国",30);

        Administrator admin = new Administrator();
        admin.setName("administrator");
        admin.setAge(35);

        register(s);
        register(t);
        register(admin);



    }


    public static void register(Person p){
        p.show();
    }
}
