import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
//        System.out.println("circle1.findArea() = " + circle1.findArea());
//        System.out.println("circle2.findArea() = " + circle2.findArea());
        System.out.println("Circle.getTotal() = " + Circle.getTotal());
    }
}

class Circle{
    private double radius;
    private int id;
    private static int total ;
    private static int init=1001;
    public Circle(){
        id=init++;
        System.out.println("id = " + id);
        total++;

//        System.out.println("init = " + init);
//        System.out.println("init*1.0 = " + init*1.0);
//        radius=new Random().nextDouble(init*1.0);
    }

    public Circle(double radius){
        this();
        this.radius=radius;
    }

    public static int getTotal() {
        return total;
    }

    public double findArea(){
        return 3.14*radius*radius;
    }
}
