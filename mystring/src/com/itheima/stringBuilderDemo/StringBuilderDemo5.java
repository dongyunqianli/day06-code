package com.itheima.stringBuilderDemo;

import java.util.Scanner;

public class StringBuilderDemo5 {
    public static void main(String[] args) {
        int length = getString().substring(1)
                .replace("A", "K")
                .length();
        System.out.println("length = " + length);


    }
    public static String getString(){
        Scanner sc =new Scanner(System.in);
        System.out.println("please input a string: ");
        String str=sc.nextLine();
        return str;

    }
}
