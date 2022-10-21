package Learn_0;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class OtherClassTest {
    @Test
    public void test1(){
        String javaVersion=System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("uesr.home"));
        System.out.println(System.getProperty("uesr.dir"));
    }
    @Test
    public void test2(){
        BigInteger bi=new BigInteger("12433241123");
        BigDecimal bd=new BigDecimal("12435.351");
        BigDecimal bd2=new BigDecimal("11");
        System.out.println(bi);
        System.out.println(bd.divide(bd2, RoundingMode.HALF_UP));
//        System.out.println(bd.divide());
    }
}
