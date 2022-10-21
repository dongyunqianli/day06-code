package com.itheima.stringBuilderDemo;

import java.util.Scanner;

public class StringBuilderDemo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input a string");
        String str=sc.next();

        String result=new StringBuilder().append(str).reverse().toString();
        if(str.equals(result)){
            System.out.println("it is symmetric string");
        }else{
            System.out.println("it is not a symmetric string");
        }
    }
}
