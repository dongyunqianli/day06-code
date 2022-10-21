package exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    @Test
    public void test1(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(343);
        collection.add(343);
        collection.forEach(System.out::println);
    }
}
