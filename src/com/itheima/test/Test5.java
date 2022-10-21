package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        printArr(arr);
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"] = " + arr[i]);

        }
    }
}
