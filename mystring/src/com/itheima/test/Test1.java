package com.itheima.test;


import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String str;
        while(true){
            System.out.println("please input a string: ");
            str = sc.next();
            boolean flag=checkStr(str);
            if(flag){
                break;
            }else{
                System.out.println("string is illegal, input again.");
                continue;
            }
        }

        StringBuilder sb =new StringBuilder();
        StringBuilder sb1 =new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c =str.charAt(i);
            int number=c-48;
            String s=changeLM(number);
            sb.append(s);
            String s1 = changeLM(c);
            sb1.append(s1);

        }
        System.out.println("sb = " + sb);
        System.out.println("sb1 = " + sb1);
    }
    public static String changeLM(int number){
        String[] arr={"","一","二","三","四","五","六","七","八","九"};
        return arr[number];
    }
    public static String changeLM(char number){
        String str=switch(number){
            case '0' -> "";
            case '1'->"一";
            case '2'->"二";
            case '3'->"三";
            case '4'->"四";
            case '5'->"五";
            case '6'->"六";
            case '7'->"七";
            case '8'->"八";
            case '9'->"九";
            default -> "haha";
        };
        return str;
    }

    public static boolean checkStr(String str){
        if(str.length()>9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c<'0'||c>'9'){
                return false;
            }
        }
        return true;
    }
}
