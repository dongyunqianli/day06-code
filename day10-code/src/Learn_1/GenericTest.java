package Learn_1;

import org.junit.Test;

import java.util.*;

public class GenericTest {
    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(87);
        list.add(99);
        list.add(65);
        for(Integer score:list){
            System.out.println("score = " + score);
        }
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }
    }
    @Test
    public void test3(){
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("Tom",87);
        map.put("Jerry",87);
        map.put("Jack",87);
        Set<Map.Entry<String,Integer>> entry=map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator=entry.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> e=iterator.next();
            String key=e.getKey();
            Integer value=e.getValue();
            System.out.println("key = " + key);
            System.out.println("value = " + value);
        }


    }
}
