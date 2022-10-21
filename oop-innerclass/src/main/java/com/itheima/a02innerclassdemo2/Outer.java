package com.itheima.a02innerclassdemo2;

public class Outer {
    private int a = 10;

    class Inner{
//        static int a = 10;
        private int a = 20;

        public void show(){
            int a=30;
            System.out.println("a = " + a);
            System.out.println("this.a = " + this.a);
            System.out.println("Outer.this.a = " + Outer.this.a);
        }
    }

    public Inner getInstance(){
        return new Inner();
    }
}
