package com.itheima.search;

import java.util.ArrayList;
import java.util.List;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        int[] arr = {131,127,147,81,103,23,7,79,81};
        ArrayList<Integer> list = basicSearch(arr, 81);
        System.out.println("list = " + list);
    }
    public static ArrayList<Integer> basicSearch(int[] arr, int number){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                list.add(i);
            }
        }
        return list;
    }
}
