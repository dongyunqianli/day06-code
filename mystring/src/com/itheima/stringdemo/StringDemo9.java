package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" please input a number: ");
        int money;
        while(true){
            money=sc.nextInt();
            if(money>=0&&money<=9999999){
                System.out.println("money = " + money);
                break;
            }else{
                System.out.println("金额无效");
            }
        }

        String moneyStr="";
        while(money!=0){
            int ge=money%10;
            money/=10;
//            System.out.println("ge = " + ge);
            String capitalNumber = getCapitalNumber(ge);
//            System.out.println("capitalNumber = " + capitalNumber);

            moneyStr=capitalNumber+moneyStr;
        }

        int count=7-moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr="零"+moneyStr;
        }

        System.out.println("moneyStr = " + moneyStr);


        String result="";
        String[] arr={"佰","拾","万","千","佰","十","元"};
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result+=c+arr[i];
        }
        System.out.println("result = " + result);


    }
    public static String getCapitalNumber(int number){
        String[] arr={"零","壹","贰","叁","肆","五","六","七","八","九","十"};
        return arr[number];
    }
}
