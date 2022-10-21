package com.itheima.a02systemdemo;

import java.util.Arrays;

public class SystemDemo1 {
    public static void main(String[] args) {

//        System.exit(0);


//        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());//16661440 34085
//        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());//16661440 51085


        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        System.arraycopy(arr1,0,arr2,4,3);
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
                
    }
}
