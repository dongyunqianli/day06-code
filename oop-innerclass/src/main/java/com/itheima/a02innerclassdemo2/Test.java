package com.itheima.a02innerclassdemo2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Outer.Inner oi = new Outer().new Inner();
        oi.show();

        Scanner sc = new Scanner(System.in);
        sc.next();

//        Outer o = new Outer();
//        System.out.println("o.getInstance() = " + o.getInstance());
    }
}
