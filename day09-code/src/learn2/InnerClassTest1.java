package learn2;

public class InnerClassTest1 {
    public void method(){
        class Aa{

        }
    }

    //返回一个实现了Comparable接口的类的对象
    public Comparable getComparable(){
/*        //create a class implements interface of Comparable:局部内部类
        class MyComparable implements Comparable{
            public int compareTo(Object o){
                return 0;
            }
        }
        return new MyComparable();*/
        //实现了Comparable接口的，匿名实现类的匿名对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }

        };

    }
}
