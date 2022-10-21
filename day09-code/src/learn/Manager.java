package learn;

public class Manager extends Employee {
    private double bonus;
    public Manager(double bonus){
        super();
        this.bonus=bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
    public void work(){
        System.out.println("manage employee, improving company operating efficiency");
    }
}
