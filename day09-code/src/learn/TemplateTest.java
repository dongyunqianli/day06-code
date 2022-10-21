package learn;

public class TemplateTest {

    public static void main(String[] args) {
        Template t=new SubTemplate();
        t.spendTime();
    }

}
abstract class Template{
    public void spendTime(){
        long start=System.currentTimeMillis();
        this.code();
        long end=System.currentTimeMillis();
        System.out.println("spend time is: "+(end-start));
    }
    public abstract void code();
}
class SubTemplate extends Template{
    @Override
    public void code() {

        for (int i = 2; i < 1001; i++) {
            boolean isFlag=true;
            for (int j = 2; j < Math.sqrt(i)+1; j++) {
                if(i%j==0){
                    isFlag=false;
                    break;
                }
            }
            if(isFlag){
                System.out.println(i);
            }
        }
    }
}