import org.junit.Test;

public class WrapperTest {
    /*public static void main(String[] args) {

        Integer integer1=10;
        System.out.println(integer1.toString()+"fight!!!");
    }*/

    @Test
    public void test1(){
        Float f1=Float.valueOf(12.3f);
        Float f2=12.4f;
        Float f3=Float.parseFloat("12.5");
        Float f4=Float.valueOf("12.6");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
    }

    @Test
    public void test2(){
        Boolean b1=true;
        Boolean b2=Boolean.parseBoolean("TrUe");
        Boolean b3=Boolean.valueOf("true123");
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
    }
    @Test
    public void test3(){

        Order order=new Order();
        System.out.println("order.isMale = " + order.isMale);
        System.out.println("order.isFemale = " + order.isFemale);
    }

    @Test
    public void test4(){

        Integer integer1=Integer.parseInt("123");
        System.out.println("integer1 = " + integer1);
        int num=2;
        Integer integer2=num;
        System.out.println("integer2.toString() = " + integer2.toString());
        
    }

    @Test
    public void test5(){
        float f1=12.3f;
        Double d1=Double.parseDouble("12.4");

        String s1=String.valueOf(f1);
        String s2=String.valueOf(d1);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }

    @Test
    public void test6(){
        String str1="123";
        String str2="trUe";
        int num1=Integer.parseInt(str1);
        boolean b1=Boolean.parseBoolean(str2);
        System.out.println("num1 = " + num1);
        System.out.println("b1 = " + b1);
    }


    @Test
    public void test7(){
        Object o1=true?Integer.valueOf(1) : Double.valueOf(2.0);
        System.out.println("o1 = " + o1);
    }

    @Test
    public void test8(){
        Integer integer1=new Integer(1);
        Integer integer2=new Integer(1);
        System.out.println(integer1==integer2);
        Integer integer3=1;
        Integer integer4=1;
        System.out.println(integer3 ==integer4);
        Integer integer5=128;
        Integer integer6=128;
        System.out.println(integer5==integer6);

    }

    @Test
    public void test9(){

    }

}
class Order{
    boolean isMale;
    Boolean isFemale;
}