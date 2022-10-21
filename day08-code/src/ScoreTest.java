import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Vector<Integer> vector = new Vector<>();
        int maxScore=0;
        for(;;){
            System.out.println("please input grade of students(end with minus)");
            int score=scanner.nextInt();
            if(score<0||score>100){
                break;
            }
            Integer inScore=score;
            vector.addElement(inScore);
            if(maxScore<score){
                maxScore=score;
            }
        }
        char level;
        for (int i = 0; i < vector.size(); i++) {
            Object obj = vector.elementAt(i);
            int inScore = (int) obj;
            int score=maxScore-inScore;
            if(score<=10){
                level='A';
            }else if(score<=20){
                level='B';
            }else if(score<=30){
                level='C';
            }else{
                level='D';
            }
            System.out.println("level = " + level);
        }
    }
}
