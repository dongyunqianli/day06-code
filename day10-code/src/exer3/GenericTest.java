package exer3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest {
    @Test
    public void test2(){
        List<String> list1=null;
        ArrayList<String> list2=null;
        list1=list2;

        List<String> list4=new ArrayList<>();
    }

    @Test
    public void test3(){
        List<Object>list1=null;
        List<String>list2=null;

        List<?> list=null;
        list=list1;
        list=list2;

//        print(list1);
//        print(list2);

        List<String>list3=new ArrayList<>();
        list3.add("AA");
        list3.add("BB");
        list3.add("cc");
        list=list3;
        list.add(null);
        Object o = list.get(0);
        System.out.println("o = " + o);


    }

    public void print(List<?>list){
        Iterator<?>iterator=list.iterator();
        while(iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println("obj = " + obj);
        }
    }
}

















