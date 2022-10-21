package learn3_exception;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        try {
            s.regist(-1001);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(s);
    }
}
class Student{
    private int id;
    public void regist(int id)throws Exception{
        if(id>0){
            this.id=id;
        }else{
//            System.out.println("the data you entered is illegal");
//            throw new RuntimeException("the data you entered is illegal");
//            throw new Exception("the data you entered is illegal");
            throw new MyException("no minus");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
