package Learn_0;

import exer.User;
import org.junit.Test;

import java.util.*;

public class ListTest {
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom",12));
        list.add(456);
        System.out.println("list = " + list);

        list.add(1,"BB");
        System.out.println("list = " + list);

        List list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);
        System.out.println("list.get(0) = " + list.get(0));

        System.out.println("list.indexOf(456) = " + list.indexOf(456));
        System.out.println("list.lastIndexOf(456) = " + list.lastIndexOf(456));

        System.out.println("list.remove(0) = " + list.remove(0));
        System.out.println("list = " + list);
        System.out.println("list.set(1,\"CC\") = " + list.set(1, "CC"));

        System.out.println("list.subList(2,4) = " + list.subList(2, 4));

        System.out.println("*******************************************************************");
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }
        System.out.println("*******************************************************************");
        for (Object obj :
                list) {
            System.out.println("obj = " + obj);
        }
        System.out.println("*******************************************************************");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i) = " + list.get(i));

        }
        
        
        
    }

    @Test
    public void test2(){
        Set set=new LinkedHashSet();
        set.add(456);
        set.add(123);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new User("Tom",12));
        set.add(new User("Tom",12));
        set.add(129);
        Iterator iterator=set.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }
}
