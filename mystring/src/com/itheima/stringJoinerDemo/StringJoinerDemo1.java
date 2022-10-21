package com.itheima.stringJoinerDemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner("---");
        System.out.println(sj.add("aaa").add("bbbb").add("ccccc"));
        System.out.println("sj.length() = " + sj.length());
        System.out.println("sj.toString().substring(1,9) = " + sj.toString().substring(1,9));


        sj=new StringJoiner(", ","[","]");
        System.out.println(sj.add("aaa").add("bbbb").add("ccccc"));
        System.out.println("sj.length() = " + sj.length());
        System.out.println("sj.toString().substring(1,9) = " + sj.toString().substring(1,9));

    }
}
