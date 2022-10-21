package exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExer {
    @Test
    public void testListRemove(){
        List list =new ArrayList();
        List list1=new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println("list = " + list);
    }
    private void updateList(List list){
//        list.remove(Integer.valueOf(2));
        list.remove(2);
    }
}
