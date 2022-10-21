package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please input a string: ");
        String str=sc.next();

        int bigCount=0;
        int smallCount=0;
        int numberCount=0;

        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);

            if(c>='a'&&c<='z'){
                smallCount++;
            }else if(c>='A'&&c<='Z'){
                bigCount++;
            }else if(c>='0'&&c<='9'){
                numberCount++;
            }
        }

        System.out.println("bigCount = " + bigCount);
        System.out.println("smallCount = " + smallCount);
        System.out.println("numberCount = " + numberCount);
    }
}
