public class SingletonTest2 {
    public static void main(String[] args) {
        Order order1 = Order2.getInstance();
        Order order2 = Order2.getInstance();
        System.out.println(order1==order2);
    }
}
class Order2{
    private Order2(){

    }
    private static Order instance=null;
    public static Order getInstance(){
        if(instance==null){
            instance=new Order();
        }
        return instance;
    }

}
