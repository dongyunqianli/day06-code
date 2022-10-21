package com.itheima.a03oopextendsdemo3;

import org.openjdk.jol.vm.VM;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        //把对象的地址值 z 用 16进制的方式打在控制台上
        System.out.println("hello world, hello my hotspot VM");
        System.out.println(Long.toHexString(VM.current().addressOf(z)));

        //内存分析工具需要程序不停止
        Scanner scanner = new Scanner(System.in);
        scanner.next();
    }
}
class Fu {
    private int anInt = 0x111;
    int b = 0x222;
    public void fuShow1(){
        System.out.println("public ... FuShow-1");
    }
    private void fuShow2(){
        System.out.println("private .... FuShow--2");
    }
}
class Zi extends Fu {
    int c = 0x333;
    public void ziShow(){
        System.out.println("public ... ZiShow.........");
    }

}
