package com.itheima.a04polymorphismdemo4;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;

/*    public void keepPet(Dog dog,String something){
        System.out.printf("age:{%s}岁的{%s}养了一只{%s}颜色{%s}岁的狗",age,name,dog.getColor(),dog.getAge());
        System.out.println();
        dog.eat(something);
    }
    public void keepPet(Cat cat,String something){
        System.out.printf("age:{%s}岁的{%s}养了一只{%s}颜色{%s}岁的猫",age,name,cat.getColor(),cat.getAge());
        System.out.println();
        cat.eat(something);
    }*/
    public void keepPet(Animal animal,String something){
        if(animal instanceof Dog dog){
            System.out.printf("age:{%s}岁的{%s}养了一只{%s}颜色{%s}岁的狗",age,name,dog.getColor(),dog.getAge());
            System.out.println();
            animal.eat(something);
            System.out.println();
        }else if(animal instanceof Cat cat){
            System.out.printf("age:{%s}岁的{%s}养了一只{%s}颜色{%s}岁的猫",age,name,cat.getColor(),cat.getAge());
            System.out.println();
            animal.eat(something);
            System.out.println();
        }else{
            System.out.println("没有这种动物");
        }

    }

}