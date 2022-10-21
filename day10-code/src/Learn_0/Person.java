package Learn_0;

public class Person {
    private String name;
    private int age;
    private String nation;

    private Person(){

    }

    private Person(String name){
        this();
        this.name=name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "Person{name= "+ name+
                ", age= "+age+"}";
    }
    public void show(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    private String nation(String nation){
        return nation;
    }
}
