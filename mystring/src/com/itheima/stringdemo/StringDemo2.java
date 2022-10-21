package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1=new String("abc");
        String s2="Abc";

        Scanner sc =new Scanner(System.in);
        String next = sc.next();
        boolean result = s1.equalsIgnoreCase(s2);
        System.out.println("result = " + result);
    }
}
