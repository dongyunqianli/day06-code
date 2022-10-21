package Learn_1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
   @Test
   public void test1(){
       List list=new ArrayList();
       list.add(123);
       list.add(43);
       list.add(765);
       list.add(-97);
       list.add(0);
       System.out.println("list = " + list);
//       Collections.reverse(list);
       Collections.shuffle(list);
       System.out.println("list = " + list);
       Collections.sort(list);
       System.out.println("list = " + list);
       Collections.swap(list,1,2);
       System.out.println("list = " + list);
   }
   @Test
   public void test2(){
        List list=new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(-97);
        list.add(0);
        List dest= Arrays.asList(new Object[list.size()]);
        System.out.println("dest.size() = " + dest.size());
        Collections.copy(dest,list);
        System.out.println("dest = " + dest);

        List list1=Collections.synchronizedList(list);



   }
}
