package com.itheima.a03runtimedemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) {
//        Runtime r1 = Runtime.getRuntime();
//        Runtime r2 = Runtime.getRuntime();
//        System.out.println(r1==r2);

//        Runtime.getRuntime().exit(0);
        System.out.println("Runtime.getRuntime().availableProcessors() = " + Runtime.getRuntime().availableProcessors());
        System.out.println("Runtime.getRuntime().maxMemory() = " + Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.println("Runtime.getRuntime().totalMemory() = " + Runtime.getRuntime().totalMemory()/1024/1024);
        System.out.println("Runtime.getRuntime().freeMemory()/1024/1024 = " + Runtime.getRuntime().freeMemory() / 1024 / 1024);

        try {
            Runtime.getRuntime().exec("notepad");
            Runtime.getRuntime().exec("shutdown -s -t 3600");
            Runtime.getRuntime().exec("shutdown -a");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
