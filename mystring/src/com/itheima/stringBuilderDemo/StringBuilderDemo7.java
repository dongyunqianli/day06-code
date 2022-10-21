package com.itheima.stringBuilderDemo;

public class StringBuilderDemo7 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        arrToString(arr);
//        System.out.println(arrToString(arr));


    }
    public static void arrToString(int[] arr){
        StringBuilder sb =new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]).append("]");
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        System.out.println("sb = " + sb);
        return;
    }
}
