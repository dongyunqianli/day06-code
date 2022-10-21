package com.itheima.test8;

public class Test3 {
    public static void main(String[] args) {
        Student[] arr=new Student[3];
        Student stu1=new Student(1,"zhangsan1",21);
        Student stu2=new Student(2,"zhangsan2",22);
        Student stu3=new Student(3,"zhangsan3",23);
//        Student stu4=new Student(4,"zhangsan4",24);
        arr[0]=stu1;
        arr[1]=stu2;
        arr[2]=stu3;


        int index = getIndex(arr, 2);
        System.out.println("index = " + index);
        if(index>=0){
            arr[index]=null;
            printArr(arr);
        }else{
            System.out.println("当前id不存在,删除失败");
        }
    }
    public static int getIndex(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu =arr[i];
            if(stu!=null){
                int sid=stu.getId();
                if(sid==id){
                    return i;
                }
            }

        }
        return -1;
    }


    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu =arr[i];
            if(stu!=null){
                System.out.println(stu.getId()+", "+stu.getName()+", "+stu.getAge());
            }
        }
    }
}
