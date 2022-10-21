package com.itheima.test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    String[] boyfaces={"风流俊雅","气宇轩昂","相貌平平"};
    String[] girlfaces={"沉鱼落雁","闭月羞花","相貌平平"};

    String[] attacks_desc={
            "%s 使出游空探爪，抓住了%s",
            "%s 大喝一声，一招霹雷坠地,劈倒了%s",
            "%s 运气于掌，一式掌心雷,击昏了%s"
    };
    String[] injureds_desc={
            "%s 退了半步，毫发无伤",
            "%s 造成了一处瘀伤",
            "%s 脸色惨白,连连后退"
    };

    public Role() {
    }

    public Role(String name, int blood,char gender) {
        this.name = name;
        this.blood = blood;
        this.gender=gender;
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r=new Random();
        if(gender=='男'){
            int index=r.nextInt(boyfaces.length);
            this.face=boyfaces[index];
        }else if(gender=='女'){
            int index=r.nextInt(girlfaces.length);
            this.face=girlfaces[index];
        }else{
            this.face = face;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role){
        Random r= new Random();
        int index = r.nextInt(attacks_desc.length);
        String KungFu=attacks_desc[index];
        System.out.printf(KungFu,this.getName(),role.getName());


        int hurt=r.nextInt(20)+1;
        int remainBlood=role.getBlood()-hurt;
        remainBlood=remainBlood<0?0:remainBlood;
        role.setBlood(remainBlood);
        System.out.println(this.getName()+" attack: "+role.getName()+
                " cause: "+hurt+" to: "+role.getName()+
                " remain: "+remainBlood+" blood");
    }
    
    public void showRoleInfo(){
        System.out.println("getName() = " + getName());
        System.out.println("getBlood() = " + getBlood());
        System.out.println("getGender() = " + getGender());
        System.out.println("getFace() = " + getFace());
    }
}
