package com.itheima.a04innerclassdemo4;

public class Outer {
    int a = 10;
    static int b = 20;
    static class Inner{
        public void show1(){
            System.out.println("a non-static method was called...");
//            Outer outer = new Outer();
//            System.out.println(outer.a);
//            System.out.println(b);
        }
        public static void show2(){
            System.out.println("a static method was called....");
//            Outer outer = new Outer();
//            System.out.println(outer.a);
//            System.out.println(b);
        }
    }
}
