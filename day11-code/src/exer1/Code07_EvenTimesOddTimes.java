package exer1;

public class Code07_EvenTimesOddTimes {
    public static void printOddTimesNum1(int[] arr){
        int eor=0;
        for (int i = 0; i < arr.length; i++) {
            eor^=arr[i];
        }
        System.out.println(eor);
    }
    public static void printOddTimesNum2(int[] arr){
        int eor=0;
        for (int i = 0; i < arr.length; i++) {
            eor^=arr[i];
        }
        int rightOne=eor&(~eor+1);
        int onlyOne=0;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i]&rightOne)!=0){
                onlyOne^=arr[i];
            }
        }
        System.out.println("onlyOne = " + onlyOne);
        System.out.println("onlyOne^eor = " + (onlyOne ^ eor));
    }

    public static int bit1counts(int N){
        int count=0;
        while(N!=0){
            int rightOne=N&(~N+1);
            count++;
            N^=rightOne;
        }
        return count;
    }

    public static void main(String[] args){
        int a=5;
        int b=7;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        int[] arr1={3,3,2,3,1,1,1,3,1,1,1};
        printOddTimesNum1(arr1);
        int[] arr2={4,3,4,2,2,2,4,1,1,1,3,3,1,1,1,4,2,2};
        printOddTimesNum2(arr2);
    }
}























