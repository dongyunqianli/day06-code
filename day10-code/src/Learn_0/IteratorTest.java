package Learn_0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    @Test
    public void test1(){
        Collection coll=new ArrayList();

        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add("Tom");
        coll.add(false);

        Iterator iterator=coll.iterator();//每次都会生成一个全新的对象
        while(iterator.hasNext()){
            if("Tom".equals(iterator.next())){
                iterator.remove();
            }
        }
        //遍历集合
        iterator=coll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(Object obj:coll){
            System.out.println(obj);
        }

    }
}
