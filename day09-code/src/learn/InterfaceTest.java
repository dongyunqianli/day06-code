package learn;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        Plane plane = new Plane();
        plane.fly();
        plane.stop();
    }
}

interface Flyable{
    public static final int MAX_SPEED=7900;
    int MIN_SPEED=1;
    public abstract void fly();
    void stop();
}

interface Attackable{
    void attack();
}


class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("take off with the enigne.");
    }

    @Override
    public void stop() {
        System.out.println("driver slow down to stop.");
    }
}

abstract class Kits implements Flyable{
    @Override
    public void fly() {

    }
}

class Bullet extends Object implements Flyable,Attackable,CC{
    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }
}

interface AA{
    void methodA();
}
interface BB{
    void methodB();
}
interface CC extends AA,BB{

}