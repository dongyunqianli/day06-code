package com.itheima.test3;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("试试");
        gf1.setAge(-18);
        gf1.setGender("女");

        System.out.println("gf1.getName() = " + gf1.getName());
        System.out.println("gf1.getAge() = " + gf1.getAge());
        System.out.println("gf1.getGender() = " + gf1.getGender());
    }
}
