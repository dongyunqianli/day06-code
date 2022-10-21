package Learn_0;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {
    @Test
    public void test1(){
        String[] arr=new String[]{"AA","BB","ZZ","KK","UU","SS"};
        Arrays.sort(arr);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,new Comparator(){
            public int compare(Object o1,Object o2){
                if(o1 instanceof String && o2 instanceof String){
                    String s1=(String)o1;
                    String s2=(String)o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("inconsistent data type entered");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void test2(){
        Goods[] arr=new Goods[6];
        arr[0]=new Goods("lenovoMouse",34);
        arr[1]=new Goods("dellMouse",43);
        arr[2]=new Goods("xiaomiMouse",12);
        arr[3]=new Goods("huaweiMouse",65);
        arr[4]=new Goods("huaweiMouse",224);
        arr[5]=new Goods("microsoftMouse",43);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,new Comparator<Goods>(){
            public int compare(Goods g1,Goods g2){
                if(g1.getName().equals(g2.getName())){
                    return -Double.compare(g1.getPrice(),g2.getPrice());
                }else{
                    return g1.getName().compareTo(g2.getName());
                }
            }
        });
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void test3(){

    }

    @Test
    public void test4(){

    }


}
