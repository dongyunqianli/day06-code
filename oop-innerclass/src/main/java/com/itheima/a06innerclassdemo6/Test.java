package com.itheima.a06innerclassdemo6;

public class Test {
    public static void main(String[] args) {


        new Swim(){

            @Override
            public void swim() {
                System.out.println("overwrite the swim method...");
            }
        }.swim();


        new Animal(){

            @Override
            public void eat() {
                System.out.println("Test of overwriting Animal abstract eat method");
            }
        }.eat();



        method(new Animal() {
            @Override
            public void eat() {
                System.out.println("dog eats bone" +
                        "bark loudly...");
            }
        });
        method1(()->{
            System.out.println("");
        });
    }
    public static void method(Animal animal){
        animal.eat();
    }
    public static void method1(Swim swim){
        swim.swim();
    }
}
