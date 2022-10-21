package Test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Stream;

public class ArraysSort2 {
    public static void main(String[] args) {
        int[][] nums=new int[][]{{1,3},{1,2},{4,5},{3,7}};

//        Arrays.sort();
        Arrays.sort(nums,2,4, (a, b) -> {
            if(a[0]==b[0]){
                return a[1]-b[1];
            }else{
                return a[0]-b[0];
            }
        });

        Integer[][] integers=new Integer[][]{{1,3},{1,2},{4,5},{3,7}};

        for (int[] num:nums){
            System.out.println(Arrays.toString(num));
        }

    }
    void backtrack(int[]nums,int start){

        LinkedList<Integer> list=new LinkedList<>();


    }
    @Test
    public void test1(){

        String s= "what a excellent algorithm.";
        char[] c = new char[20];
        s.getChars(1,3,c,3);
        System.out.println(Arrays.toString(c));
        for(char ci:c){
            System.out.print(ci);
        }
    }
    @Test
    public void test2(){

        String s= "9246what a excellent algorithm.";
        char[] ch;
        ch=s.toCharArray();
        for (int i = 0; i < 4; i++) {

            ch[i] = (ch[i]=='9')?'0': (char) (ch[i] + 1);

        }
        System.out.println("Arrays.toString(ch) = " + Arrays.toString(ch));


    }
}
