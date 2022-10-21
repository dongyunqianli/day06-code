package com.itheima.search;

public class A02_BinarySearchDemo1 {
    public static void main(String args[]){
        int[] arr = {7, 23, 79, 81,103, 127, 131, 147};
        System.out.println(binarySearch(arr,131));
    }
    public static int binarySearch(int[] arr, int number){
        int min = 0;
        int max = arr.length-1;
        while(min<=max){
            int mid = (min+max)/2;
            if(arr[mid]>number){
                max=mid-1;
            }else if(arr[mid]<number){
                min=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}
