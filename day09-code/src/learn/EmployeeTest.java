package learn;

public class EmployeeTest {
    public static void main(String[] args) {
//        Employee manager=new Manager("库克",1001,5000,5000);
//        manager.work();
//        new CommonEmployee().work();
//        Employee employee_sub=new Employee() {
//            @Override
//            public void work() {
//                System.out.println("you basketball");
//            }
//        };
//        System.out.println("********************");
//        employee_sub.work();
        new Employee(){
            public void work(){
                System.out.println("genius...");
            }
        }.work();
    }
}
