package reflection_Learning;

import Learn_0.Person;
import org.junit.Test;

import javax.xml.namespace.QName;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;

public class Ref_test {
    @Test
    public void test2(){
        for (int i = 0; i < 100; i++) {
            int num=new Random().nextInt(3);
            String classPath="";
            switch(num){
                case 0:
                    classPath="java.util.Date";
                    break;
                case 1:
                    classPath="java.lang.Object";
                    break;
                case 2:
                    classPath="com.atguigu.java.Person";
                    break;
            }
            try{
                Object obj=getInstance(classPath);
                System.out.println("obj = " + obj);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }

    public Object getInstance(String classPath) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class clazz=Class.forName(classPath);

        return clazz.newInstance();
    }


    @Test
    public void test1() throws Exception{
        Class<Person> clazz=Person.class;

        Constructor<Person> cons = clazz.getConstructor(String.class, int.class);
        Person person=cons.newInstance("Tom",12);
        System.out.println("person = " + person);

        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(person,10);
        System.out.println("person.toString() = " + person.toString());

        Method show = clazz.getDeclaredMethod("show");
        show.invoke(person);
        Constructor<Person> cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p1 = cons1.newInstance("Bruce");
        System.out.println("p1 = " + p1);

        Method nation = clazz.getDeclaredMethod("nation", String.class);
        nation.setAccessible(true);
        Object nation1 = nation.invoke(p1, "China");
        System.out.println("nation1 = " + nation1);


    }
    @Test
    public void test3() throws Exception {
        String str="Learn_0.Person";
        Class clazz=Class.forName(str);
        Constructor declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Object obj = declaredConstructor.newInstance();
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(obj,"Jarry");
        System.out.println("name.get(obj) = " + name.get(obj));


    }
}































