package learn3_exception;

import org.junit.Test;

import java.util.Date;

public class ExceptionTest {
    @Test
    public void test1(){
        String str=null;
        System.out.println(str.charAt(0));
    }

    @Test//ClassCastException
    public void test2(){
        Object obj=new Date();
        String str=(String)obj;
    }
    @Test//NumberFormatException
    public void test3(){
        String str="123";
        str="abc";
        try {
            int num=Integer.parseInt(str);
            System.out.println("hello---1");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
            System.out.println(e.getMessage());
        }
        System.out.println("hello---2");

    }
}
