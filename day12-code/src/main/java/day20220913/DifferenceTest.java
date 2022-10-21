package day20220913;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DifferenceTest {
    public static void main(String[] args) {
        int[][] updates={{1,3,2},{2,4,3},{0,2,-2}};
        int[] modifiedArray = getModifiedArray(5, updates);
        System.out.println(Arrays.toString(modifiedArray));
    }
    public static int[] corpFlightBookings(int[][] bookings, int n){
        int[] nums=new int[n];
        Difference df=new Difference(nums);
        for(int[] booking:bookings){
            int i=booking[0]-1;
            int j=booking[1]-1;
            int val=booking[2];
            df.increment(i,j,val);
        }
        return df.result();
    }
    public static int[] getModifiedArray(int length, int[][] updates){
        int[] nums=new int[length];
        Difference df=new Difference(nums);
        for(int[] update:updates){
            int i=update[0];
            int j=update[1];
            int val=update[2];
            df.increment(i,j,val);
        }
        return df.result();
    }
}
class Difference{
    private int[] diff;
    public Difference(int[] nums){
        assert nums.length>0;
        diff=new int[nums.length];
        diff[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            diff[i]=nums[i]-nums[i-1];
        }
    }
    public void increment(int i, int j, int val){
        diff[i]+=val;
        if(j+1<diff.length){
            diff[j+1]-=val;
        }
    }
    public int[] result(){
        int[] res=new int[diff.length];
        res[0]=diff[0];
        for(int i=1;i<diff.length;i++){
            res[i]=res[i-1]+diff[i];
        }
        return res;
    }
}
