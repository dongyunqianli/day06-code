package Learn_2;

import org.junit.Test;

import java.util.List;

public class GenericTest1 {
    @Test
    public void test1(){
        Order<String> order1=new Order<>("orderAA",1001,"order:AA");
        order1.setOrderT("AA:hello");
    }
    @Test
    public void test2(){
        SubOrder sub1=new SubOrder();
        sub1.setOrderT(1122);

        SubOrder1<String> sub2=new SubOrder1<>();
        sub2.setOrderT(("order2...."));
    }

    @Test
    public void test3(){
        Order<String> order = new Order<>();
        Integer[] arr=new Integer[]{1,2,3,4};
        List<Integer> list = order.copyFromArrayToList(arr);
        System.out.println("list = " + list);
    }
}
