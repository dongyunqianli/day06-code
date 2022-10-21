package learn1;

public interface CompareA {
    public static void method1(){
        System.out.println("CompareA:北京");
    }
    public default void method2(){
        System.out.println("CompareA:上海");
    }
    default void method3(){
        System.out.println("CompareA:广州");
    }
}
