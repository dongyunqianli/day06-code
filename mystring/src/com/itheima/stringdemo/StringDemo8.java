package com.itheima.stringdemo;

public class StringDemo8 {
    public static void main(String[] args) {
        System.out.println(reverse("abc"));

    }

    public static String reverse(String str){
        String result="";
        for (int i = str.length()-1; i >= 0; i--) {
            char c=str.charAt(i);
            result+=c;
        }
        return result;
    }
}
