package com.itheima.test;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1=new User("heima001","zhangsan1","12345678");
        User u2=new User("heima002","zhangsan2","1234567");
        User u3=new User("heima003","zhangsan3","123456");
        list.add(u1);
        list.add(u2);
        list.add(u3);
//        boolean heima001 = contains(list, "heima001");
//        System.out.println("heima001 = " + heima001);
        int index = getIndex(list, "heima002");
        System.out.println("index = " + index);
    }
    public static int getIndex(ArrayList<User>list, String id){
        for (int i = 0; i < list.size(); i++) {
            User u=list.get(i);
            String uid=u.getId();
            if(uid.equals(id)){
                return i;
            }
        }
        return -1;
    }
    public static boolean contains(ArrayList<User>list, String id){
        /*for (int i = 0; i < list.size(); i++) {
            User u=list.get(i);
            String uid=u.getId();
            if(uid.equals(id)){
                return true;
            }
        }
        return false;*/
        return getIndex(list,id)>=0;
    }
}
