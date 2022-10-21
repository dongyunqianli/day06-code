package com.itheima.listdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        /*1. add(E e), return true */
        boolean aaaResult = list.add("aaa");
        System.out.println("aaaResult = " + aaaResult);
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        /*2. remove(E e) return boolean */
        boolean result=list.remove("aaa");
        System.out.println("result = " + result);
        /*2. remove(int index) return E */
        String remove = list.remove(2);
        System.out.println("remove = " + remove);

        System.out.println("list = " + list);

        /*3. set E(int index, E e) return E */
        String ddd = list.set(1, "ddd");
        System.out.println("ddd = " + ddd);
        System.out.println("list = " + list);

        /*4. get(int index) return E */
        String s = list.get(1);
        System.out.println("s = " + s);

        for (String l1 : list) {
            System.out.println("l1 = " + l1);
        }

        for (int i = 0; i < list.size(); i++) {
            String l2 = list.get(i);
            System.out.println("l2 = " + l2);
        }
    }
}
