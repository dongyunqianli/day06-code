package com.itheima.test3;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age<=50&&age>=18){

            this.age=age;
        }else{
            System.out.println("非法参数");
        }
    }
    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }
}
