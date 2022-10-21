package day20220909;

import org.junit.jupiter.api.Test;

public class maxProfitTest {
    @Test
    public void test1(){

    }
}
class Solution{
    int maxProfit_k_2(int[] prices){
        int max_k=2, n= prices.length;
        int[][][] dp=new int[n][max_k+1][2];
        for(int i=0;i<n;i++){
            for(int k=max_k;k>=1;k--){
                if(i-1==-1){
                    dp[i][k][0]=0;
                    dp[i][k][1]=-prices[i];
                    continue;
                }
                dp[i][k][0]=Math.max(dp[i-1][k][0],dp[i-1][k][1]+prices[i]);
                dp[i][k][1]=Math.max(dp[i-1][k][1],dp[i-1][k-1][0]-prices[i]);
            }
        }
        return dp[n-1][max_k][0];
    }
    int maxProfit_k_2_2(int[] prices){
        int dp_i10=0,dp_i11=Integer.MIN_VALUE;
        int dp_i20=0,dp_i21=Integer.MIN_VALUE;
        for(int price:prices){
            dp_i20=Math.max(dp_i20,dp_i21+price);
            dp_i21=Math.max(dp_i21,dp_i10-price);
            dp_i10=Math.max(dp_i10,dp_i11+price);
            dp_i11=Math.max(dp_i11,-price);
        }
        return dp_i20;
    }

    int maxProfit_all_in_one(int max_k, int[] prices, int cooldown, int fee){
        int n=prices.length;
        if(n<=0){
            return 0;
        }
        if(max_k>n/2){
            return maxProfit_k_inf(prices,cooldown,fee);
        }
        int[][][] dp=new int[n][max_k+1][2];
        for(int i=0;i<n;i++){
            dp[i][0][1]=Integer.MIN_VALUE;
            dp[i][0][0]=0;
        }
        for(int i=0;i<n;i++){
            for(int k=max_k;k>=1;k--){
                if(i-1==-1){
                    dp[i][k][0]=0;
                    dp[i][k][1]=-prices[i]-fee;
                    continue;
                }
                if(i-cooldown-1<0){
                    dp[i][k][0]=Math.max(dp[i-1][k][0],dp[i-1][k][1]+prices[i]);
                    dp[i][k][1]=Math.max(dp[i-1][k][1],-prices[i]-fee);
                    continue;
                }
                dp[i][k][0]=Math.max(dp[i-1][k][0],dp[i-1][k][1]+prices[i]);
                dp[i][k][1]=Math.max(dp[i-1][k][1],dp[i-cooldown-1][k-1][0]-prices[i]-fee);
            }
        }
        return dp[n-1][max_k][0];
    }
    int maxProfit_k_inf(int[] prices, int cooldown, int fee){
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int i=0;i<n;i++){
            if(i-1==-1){
                dp[i][0]=0;
                dp[i][1]=-prices[i]-fee;
                continue;
            }
            if(i-cooldown-1<0){
                dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
                dp[i][1]=Math.max(dp[i-1][1],-prices[i]-fee);
            }
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-cooldown-1][0]-prices[i]-fee);
        }
        return dp[n-1][0];
    }
}
