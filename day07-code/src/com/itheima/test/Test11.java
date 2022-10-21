package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {

        int[] arr=createNumber();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  " + arr[i]);
        }
        System.out.println();

        System.out.println("====================================");

        int[] userInputNumber=userInputNumber();
        for (int i = 0; i < userInputNumber.length; i++) {
            System.out.print("  " + userInputNumber[i]);
        }
        System.out.println();

        int redCount=0;
        int blueCount=0;
        for (int i = 0; i < userInputNumber.length-1; i++) {
            int redNumber=userInputNumber[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if(redNumber==arr[j]){
                    redCount++;
                    break;
                }
            }

        }
        int blueNumber=userInputNumber[userInputNumber.length-1];
        if(blueNumber==arr[arr.length-1]){
            blueCount++;
        };

        System.out.println("redCount = " + redCount);

        System.out.println("blueCount = " + blueCount);

    }

    public static int[] userInputNumber(){
        int[] arr=new int[7];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第"+(i+1)+"个红球号码");
            int redNumber=sc.nextInt();
            if(redNumber>0&&redNumber<34){
                boolean flag = contains(arr,redNumber);
                if(!flag){
                    arr[i]=redNumber;
                    i++;
                }else{
                    System.out.println("当前红球号码，已经存在");
                }
            }else{
                System.out.println("当前红球号码超出范围");
            }
        }


        System.out.println("请输入蓝球号码");
        while(true){
            int blueNumber=sc.nextInt();
            if(blueNumber>0&&blueNumber<17){
                arr[arr.length-1]=blueNumber;
                break;
            }else{
                System.out.println("当前蓝球号码超出范围");
            }
        }


        return arr;

    }

    public static int[] createNumber(){
        int[] arr=new int[7];

        Random r=new Random();
        for (int i = 0; i < 6;) {
            int redNumber=r.nextInt(33)+1;
            boolean flag=contains(arr,redNumber);
            if(!flag){
                arr[i]=redNumber;
                i++;
            }
        }

        int blueNumber=r.nextInt(16)+1;
        arr[arr.length-1]=blueNumber;

        return arr;

    }
    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return true;
            }
            return false;
        }
        return true;
    }
}
