package com.itheima.stringBuilderDemo;

public class StringBuilderDemo3 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("abc");

        sb.append(1);
        sb.append(2.3);
        sb.append(true);

        sb.reverse();

        System.out.println("sb.length() = " + sb.length());
        System.out.println("sb = " + sb);

        String str =sb.toString();
        System.out.println("str.equals(sb) = " + str.equals(sb));
    }
}
