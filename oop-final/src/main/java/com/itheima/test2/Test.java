package com.itheima.test2;

public class Test {
    public static void main(String[] args) {
        final Student S = new Student("zhangsan",23);
        /*引用数据类型：记录的地址值不能发生改变，内部的属性值还是可以改变的，*/
        S.setName("李四");
        S.setAge(24);
        System.out.println(S.getName()+", "+S.getAge());

        final int[] ARR = {1,2,3,4,5};
        ARR[0]=10;
        ARR[1]=20;
        for (int i = 0; i < ARR.length; i++) {
            System.out.println(ARR[i]);
        }

    }
}
