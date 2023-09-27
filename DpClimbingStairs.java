import java.util.*;
public class DpClimbingStairs {
    public static int countWays(int n, int dp[]){
        if(n == 0){
            return 1;
        }
        if(n<0){
            return 0;
        }

        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = countWays(n-1, dp) + countWays(n-2, dp);
        return dp[n];
    }
    public static int countWaysTab(int n){
        int ways[] = new int[n+1];
        ways[0] = 1;
        for(int i=1; i<=n; i++){
            if(i == 1){
                ways[i] = ways[i-1] + 0;
            }else{
                ways[i] = ways[i-1] + ways[i-2];
            }
        }

        return ways[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println("Memoization: "+countWays(n, dp));
        System.out.println("Tabulation: "+countWaysTab(n));
    }
}
