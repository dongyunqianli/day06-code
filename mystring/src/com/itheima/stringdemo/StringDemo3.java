package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a string:");
        String str1=scanner.next();
        String str2="abc";
        System.out.println(str1==str2);
    }
}
