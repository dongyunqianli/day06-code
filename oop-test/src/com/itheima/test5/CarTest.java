package com.itheima.test5;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr=new Car[3];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c =new Car();
            //brand
            System.out.println("input brand: ");
            String brand=sc.next();
            c.setBrand(brand);
            //price
            System.out.println("input price: ");
            int price=sc.nextInt();
            c.setPrice(price);
            //color
            System.out.println("input color: ");
            String color=sc.next();
            c.setColor(color);
            arr[i]=c;
        }
        for (int i = 0; i < arr.length; i++) {
            Car car=arr[i];
            System.out.println("car.getBrand() = " + car.getBrand());
            System.out.println("car.getPrice() = " + car.getPrice());
            System.out.println("car.getColor() = " + car.getColor());
        }

    }
}
