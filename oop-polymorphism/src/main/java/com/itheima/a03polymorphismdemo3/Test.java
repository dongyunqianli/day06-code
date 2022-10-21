package com.itheima.a03polymorphismdemo3;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        /*if(a instanceof Dog){
            Dog d = (Dog) a;
        }else if(a instanceof Cat){
            Cat c = (Cat) a;
            c.catchMouse();
        }else{
            System.out.println("没有这个类型，无法转换");
        }*/
        if(a instanceof Dog d){
            d.lookHome();
        }else if(a instanceof Cat c){
            c.catchMouse();
        }else{
            System.out.println("no this type, failed");
        }
    }

}
class Animal{
    public void eat(){
        System.out.println("animal is eating...");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("dog is eating meat");
    }
    public void lookHome(){
        System.out.println("dog mind the house");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("cat is eating fish");
    }
    public void catchMouse(){
        System.out.println("cat is catching mouse");
    }
}
