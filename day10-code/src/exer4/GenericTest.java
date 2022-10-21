package exer4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    @Test
    public void test1(){
        List<? extends Person> list1=null;
        List<? super Person> list2=null;
        List<Student> list3=new ArrayList<>();
        List<Person> list4=new ArrayList<>();
        List<Object> list5=new ArrayList<>();
        list1=list3;
        list1=list4;
        Person p = list1.get(0);


        list2=list4;
        list2=list5;
        Object obj = list2.get(0);

        list2.add(new Student());
        list2.add(new Person());



    }
}
