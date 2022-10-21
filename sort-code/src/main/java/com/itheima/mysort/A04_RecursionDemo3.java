package com.itheima.mysort;

public class A04_RecursionDemo3 {
    public static void main(String[] args) {
        System.out.println(getFactorialRecursion(5));

    }
    public static int getFactorialRecursion(int number){
        if(number==1){
            return 1;
        }
        return number*getFactorialRecursion(number-1);
    }
}
