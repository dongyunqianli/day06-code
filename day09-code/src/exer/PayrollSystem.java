package exer;

import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
/*        Scanner scanner=new Scanner(System.in);
        System.out.println("please input month:");
        int month=scanner.nextInt();*/

        Calendar calender = Calendar.getInstance();
        int month = calender.get(Calendar.MONTH)+1;
        System.out.println("month = " + month);

        Employee[] emps=new Employee[2];
        emps[0]=new SalariedEmployee("mason", 1002,new MyDate(1992,2,28),10000);
        emps[1]=new HourlyEmployee("mason1", 1003,new MyDate(1991,5,6),60,240);

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);

            if (month==emps[i].getBirthday().getMonth()) {
                System.out.println("salary = " + (emps[i].earnings()+100));
            }else{
                System.out.println("salary = " + emps[i].earnings());

            }
        }

    }
}
