package Learn_1;

import org.junit.Test;

import java.util.*;

public class MapTest {
    @Test
    public void test3(){
        Map map=new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",123);
        map.put("AA",87);
        System.out.println("map = " + map);
        Map map1=new HashMap();
        map1.put("CC",1230);
        map1.put("Dd",123);
        map.putAll(map1);
        System.out.println("map = " + map);
        System.out.println("map.remove(\"CC\") = " + map.remove("CC"));
        System.out.println("map = " + map);
        map.clear();
        System.out.println("map.size() = " + map.size());
        System.out.println("map = " + map);
    }
    @Test
    public void test4(){
        Map map=new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);
        System.out.println(map.get(45));
        boolean isExist = map.containsKey("BB");
        System.out.println("isExist = " + isExist);
        isExist= map.containsValue(123);
        System.out.println("isExist = " + isExist);
        int size = map.size();
        System.out.println("size = " + size);
        map.clear();
        System.out.println("map.isEmpty() = " + map.isEmpty());


    }
    @Test
    public void test5(){
        Map map=new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);
        Set set = map.keySet();
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("***********************");

        Collection values=map.values();
        for (Object obj:values){
            System.out.println(obj);
        }

        Set entrySet=map.entrySet();
        Iterator iterator1=entrySet.iterator();
        while(iterator1.hasNext()){
            Object obj=iterator1.next();
            Map.Entry entry=(Map.Entry)obj;
            System.out.println("entry.getKey()+\"--->\"+entry.getValue() = " + entry.getKey()+"--->"+entry.getValue());
        }


        Set keySet=map.keySet();
        Iterator iterator2=keySet.iterator();
        while(iterator2.hasNext()){
            Object key=iterator2.next();
            Object value=map.get(key);
            System.out.println(key+"====="+value);
        }

    }
}


















