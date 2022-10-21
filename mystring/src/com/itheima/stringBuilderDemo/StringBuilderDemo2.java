package com.itheima.stringBuilderDemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("abc");
        }
        String string = sb.toString();
        System.out.println("sb.reverse() = " + sb.reverse());
        System.out.println(sb);
        System.out.println("sb.length() = " + sb.length());
    }
}
