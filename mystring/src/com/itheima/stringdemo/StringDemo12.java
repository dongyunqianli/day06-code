package com.itheima.stringdemo;

public class StringDemo12 {
    public static void main(String[] args) {
        String talk="play well, don't play it anymore. SB, TMD.";

        String[] arr={"TMD","CNM","SB","MLGB"};
        for (int i = 0; i < arr.length; i++) {
            talk=talk.replace(arr[i],"****");
        }
        System.out.println("talk = " + talk);
    }
}
