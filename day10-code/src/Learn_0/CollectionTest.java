package Learn_0;

import org.junit.Test;

import java.util.*;

public class CollectionTest {
    @Test
    public void test1(){
        Collection coll=new ArrayList();
        coll.add("AA");
        coll.add("BB");
        coll.add(123);
        coll.add(new Date());

        Collection coll1=new ArrayList();
        coll1.add(456);
        coll1.add("CC");

        coll.addAll(coll1);
        System.out.println("coll.size() = " + coll.size());

        System.out.println("coll = " + coll);
        coll.clear();
        System.out.println("coll.isEmpty() = " + coll.isEmpty());
    }
    @Test//remove(),removeAll()
    public void test2(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add("Tom");
        coll.add(false);

        boolean remove = coll.remove(123);
        System.out.println("remove = " + remove);


        Collection coll1= Arrays.asList(123, 4567);
        coll.removeAll(coll1);
        System.out.println("coll = " + coll);
    }
    @Test
    public void test3(){
        Collection coll=new ArrayList();
        coll.add(1);
        coll.add(2);
        coll.add(3);
        coll.add(4);

        Collection coll2=new ArrayList();
        coll2.add(1);
        coll2.add(2);
        coll2.add(3);
        coll2.add(4);
        System.out.println("coll.equals(coll2) = " + coll.equals(coll2));

        Collection coll1=new ArrayList();
        coll1.add(4);
        coll1.add(5);
        coll.retainAll(coll1);

        System.out.println(coll);
    }

    @Test
    public void test4(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add("Tom");
        coll.add(false);
        //返回当前对象的 哈希值
        System.out.println(coll.hashCode());
        //8.集合-->数组：toArray()
        Object[] arr=coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //9.数组-->集合
        List<String> list = Arrays.asList(new String[]{"AA","BB","CC"});
        System.out.println("list = " + list);

        //9.attention:
        List arr1=Arrays.asList(new int[]{123,456});
        System.out.println("arr1 = " + arr1);

        List arr2=Arrays.asList(new Integer[]{123,456});
        System.out.println("arr2.size() = " + arr2.size());
        System.out.println("arr2 = " + arr2);


    }
}
