package com.itheima.test;

public class Test4StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println("sb.capacity() = " + sb.capacity());
        System.out.println("sb.length() = " + sb.length());
        sb.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println("sb.capacity() = " + sb.capacity());
        System.out.println("sb.length() = " + sb.length());

        StringBuilder sb1=new StringBuilder();
        System.out.println("sb1.capacity() = " + sb1.capacity());
        System.out.println("sb1.length() = " + sb1.length());
        sb1.append("abcdefghijklmnopqrstuvwxyz0123456789");
        System.out.println("sb1.capacity() = " + sb1.capacity());
        System.out.println("sb1.length() = " + sb1.length());
    }
}
