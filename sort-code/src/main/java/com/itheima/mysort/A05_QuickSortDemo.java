package com.itheima.mysort;

import java.util.Arrays;
import java.util.Random;

public class A05_QuickSortDemo {
    public static void main(String[] args) {
//        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        int[] arr = new int[10000000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }


        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        long start = System.currentTimeMillis();
        quickSort(arr,0,arr.length-1);
        long end = System.currentTimeMillis();

        System.out.println("------------------------------------------------------------");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        System.out.println("end-start = " + (end-start));
    }
    public static void quickSort(int[] arr, int i, int j){
        int start = i;
        int end = j;
        if(start > end){
            return;
        }
        int baseNumber = arr[i];
        while(start != end){
            while(true){
                if(end <= start || arr[end] < baseNumber){
                    break;
                }
                end--;
//                System.out.println("end = " + end);
            }
            while(true){
                if(end <= start || arr[start] > baseNumber){
                    break;
                }
                start++;
//                System.out.println("start = " + start);
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
//            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        }
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        quickSort(arr, i ,start-1);
        quickSort(arr, start+1 ,j);

    }
}
