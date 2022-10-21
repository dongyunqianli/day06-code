package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int[] scoreArr=getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println("scoreArr["+i+"] = " + scoreArr[i]);
        }

    }
    public static int[] getScores(){
        int[] scores=new int[6];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            int score=sc.nextInt();
            if(score>=0&&score<=100){
                scores[i]=score;
                i++;
            }
        }
        return scores;
    }
}
