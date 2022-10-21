package com.itheima.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {

        String id="330382202212300027";
        char gender=id.charAt(16);
        if((gender-48)%2==0){
            System.out.println("female");
        }else{
            System.out.println("male");
        }
    }
}
