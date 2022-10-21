package exer2;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {
    @Test
    public void test2(){
        TreeSet<Employee> set = new TreeSet<>(new Comparator<Employee>(){
            @Override
            public int compare(Employee e1, Employee e2) {
                MyDate b1 = e1.getBirthday();
                MyDate b2 = e2.getBirthday();

                return b1.getDay()-b2.getDay();
            }


/*
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1=(Employee) o1;
                    Employee e2=(Employee) o2;
                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();
                   *//* int minusYear=b1.getYear()-b2.getYear();
                    if(minusYear!=0){
                        return minusYear;
                    }
                    int minusMonth = b1.getMonth() - b2.getMonth();
                    if(minusMonth!=0){
                        return minusMonth;
                    }
                    return b1.getDay()-b2.getDay();
*//*
                    return b1.compareTo(b2);
                }
                throw new RuntimeException("inconsistent data type entered");
            }*/
        });
        Employee e1=new Employee("liudehua",55,new MyDate(1965,5,4));
        Employee e2=new Employee("zhangxueyou",43,new MyDate(1987,5,4));
        Employee e3=new Employee("guofucheng",44,new MyDate(1987,5,9));
        Employee e4=new Employee("liming",51,new MyDate(1954,8,12));
        Employee e5=new Employee("liangchaowei",21,new MyDate(1978,12,4));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        set.forEach(System.out::println);
    }
    @Test
    public  void test1(){
        TreeSet<Employee> set=new TreeSet<>();
        Employee e1=new Employee("liudehua",55,new MyDate(1965,5,4));
        Employee e2=new Employee("zhangxueyou",43,new MyDate(1987,5,4));
        Employee e3=new Employee("guofucheng",44,new MyDate(1987,5,9));
        Employee e4=new Employee("liming",51,new MyDate(1954,8,12));
        Employee e5=new Employee("liangchaowei",21,new MyDate(1978,12,4));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        set.forEach(System.out::println);
        Iterator<Employee> iterator = set.iterator();
        while(iterator.hasNext()){
            Employee next = iterator.next();
            System.out.println("next = " + next);
        }

    }
}
