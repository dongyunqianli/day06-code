package com.itheima.a05innerclassdemo5;

public class Outer {
    int b=20;
    public void show(){
        int a = 10;

        class Inner{
            String name;
            int age;

            public void method1(){
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println("局部内部类中的method1方法..");
            }
            public static void method2(){
                System.out.println("局部内部类中的method2静态方法...");
            }
        }
        Inner i = new Inner();
        System.out.println("i.name = " + i.name);
        System.out.println("i.age = " + i.age);
        i.method1();
        Inner.method2();

    }
}
