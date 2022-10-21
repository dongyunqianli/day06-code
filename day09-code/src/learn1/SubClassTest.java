package learn1;

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        CompareA.method1();
        s.method2();
        s.method3();


    }
}
class SubClass extends SuperClass implements CompareA,CompareB{

    public void method2(){
        System.out.println("SubClass:上海");
    }
    public void method3(){
        System.out.println("SubClass:深圳");
    }
    public void myMethod(){
        method3();
        super.method3();
        //调用接口中的默认方法
        CompareA.super.method3();
        CompareB.super.method3();
    }
}