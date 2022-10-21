package learn2;

public class InnerClassTest {
    public static void main(String[] args) {
        Person.Dog dog=new Person.Dog();
        dog.show();


        Person.Bird bird=new Person().new Bird();
        bird.sing();

        Person person = new Person();
        Person.Bird bird1 = person.new Bird();
        bird1.sing();

        System.out.println("****************************");
        bird.display("Oriole");

    }
}
class Person{
    String name="xiaoming";
    int age;

    public void eat(){
        System.out.println("people eat rice");
    }


    //成员内部类
     static class Dog{
        public void show(){
            System.out.println("卡拉是条狗");
        }

    }
     class Bird{
        String name="cuckoo";
        public Bird(){

        }
        public void sing(){
            System.out.println("i am a little bird.");
            Person.this.eat();
            eat();
        }
        public void display(String name){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Person.this.name);
        }
    }


    //局部内部类1，2，3
    public void method(){
        class AA{

        }
    }
    {
        class BB{

        }
    }
    public Person(){
        class CC{

        }
    }
}
