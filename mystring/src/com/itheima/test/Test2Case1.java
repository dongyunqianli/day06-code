package com.itheima.test;

public class Test2Case1 {
    public static void main(String[] args) {
        String strA="abcde";
        String strB="cdeab";
        boolean check = check(strA, strB);
        System.out.println("check = " + check);
    }

    public static boolean check(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA=rotate(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;
    }
    public static String rotate(String str){
        char first=str.charAt(0);
        String end=str.substring(1);
        return end+first;
    }
}
