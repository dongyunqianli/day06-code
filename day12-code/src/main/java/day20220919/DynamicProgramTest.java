package day20220919;

import org.junit.jupiter.api.Test;

public class DynamicProgramTest {
    int fib(int N){
        if(N==0)return 0;
        int[] dp=new int[N+1];
        dp[0]=0;dp[1]=1;
        for(int i=2;i<=N;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[N];
    }
    int fib2(int n){
        if(n==0||n==1){
            return n;
        }
        int dp_i_1=1,dp_i_2=0, dp_i;
        for(int i=2;i<=n;i++){
            dp_i=dp_i_1+dp_i_2;
            dp_i_2=dp_i_1;
            dp_i_1=dp_i;
        }
        return dp_i_1;
    }
    @Test
    public void test1(){
        System.out.println("fib(20) = " + fib(20));
    }
}
