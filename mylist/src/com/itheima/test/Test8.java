package com.itheima.test;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1=new Phone("小米1",1000);
        Phone p2=new Phone("小米2",7000);
        Phone p3=new Phone("小米3",2900);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> phoneInfoList = getPhoneInfo(list);
        for (Phone phone : phoneInfoList) {
            System.out.println("phone = " + phone);
        }
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone phone = phoneInfoList.get(i);
            System.out.println("phone.getBrand()+\", \"+phone.getPrice() = " + phone.getBrand()+", "+phone.getPrice());
        }

    }
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        ArrayList<Phone> resultList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
           /* Phone p=list.get(i);
            int price = p.getPrice();
            if(price<3000){
                resultList.add(p);
            }*/
            if(list.get(i).getPrice()<3000){
                resultList.add(list.get(i));
            }
        }
        return resultList;
    }
}
