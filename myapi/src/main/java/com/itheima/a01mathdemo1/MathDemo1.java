package com.itheima.a01mathdemo1;

public class MathDemo1 {
    public static void main(String[] args) {
        //  abs
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Math.abs(-2147483648));
//        System.out.println(Math.absExact(Integer.MIN_VALUE));

        //  ceil-->最近整数, floor<--最近整数, round最近整数
        System.out.println(Math.ceil(-12.34));
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(-12.34));
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.54));
        System.out.println(Math.round(-12.34));
        System.out.println(Math.round(-12.54));

        //  max,min
        System.out.println(Math.max(20, 30));
        System.out.println(Math.min(20, 30));

        //  pow,sqrt,cbrt(根号三)
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(2, -2));//0.25
        System.out.println(Math.pow(4, 0.5));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(8));

        //  random
        System.out.println(Math.random());

    }
}
