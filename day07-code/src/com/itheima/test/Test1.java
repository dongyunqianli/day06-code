package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        boolean season=false;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入机票的原价: ");
        int ticket = sc.nextInt();
        if(ticket<=0){
            System.out.println("ticket is illegal.");
            return;
        }

        System.out.println("please input month: ");
        int month=sc.nextInt();
        if(month<13&&month>0){
            if(month>4&&month<11){
                season=true;
            }
        }else{
            System.out.println("month is illegal.");
            return;
        }

        System.out.println("please input 舱位(0 头等舱，1 经济舱): ");
        int seat=sc.nextInt();
        if(seat!=0&&seat!=1){
            System.out.println("seat is illegal");
            return;
        }

        System.out.println(percentage(seat, season) * ticket);


    }

    public static double percentage(int seat,boolean season){
        if (season) {
            if(seat==0){
                return 9;
            }else{
                return 8.5;
            }
        }else{
            if(seat==0){
                return 7;
            }else{
                return 6.5;
            }
        }
    }
}
