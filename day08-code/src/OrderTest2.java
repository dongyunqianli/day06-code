public class OrderTest2 {
    public static void main(String[] args) {
        Order3 order = new Order3();
        System.out.println("order.orderId="+order.orderId);
    }

}
class Order3{
    {
        orderId=4;
    }
    int orderId=3;

}
