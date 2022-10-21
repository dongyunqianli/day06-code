public class Customer {

    int age;
    String name;

    Customer(){}
    Customer(String name,int age){
        this.age=age;
        this.name=name;
    }

    public String toString(){
        return "Customer[name="+name+", age="+age+"]";
    }
}
