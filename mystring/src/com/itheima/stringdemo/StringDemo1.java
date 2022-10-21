package com.itheima.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        char[] chs={'a','b','c','d'};
        String s4=new String(chs);
        System.out.println("s4 = " + s4);

        byte[] bytes={97,98,99,100};
        String s5=new String(bytes);
        System.out.println("s5 = " + s5);
    }
}
