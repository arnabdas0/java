public class DpLcs {
    public static int lcsRecc(String str1, String str2, int n, int m){
        //base case
        if(n==0 || m==0){
            return 0;
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return lcsRecc(str1, str2, n-1, m-1)+1;
        }else{
            return Math.max(lcsRecc(str1, str2, n-1, m), lcsRecc(str1, str2, n, m-1));
        }
    }

    public static int lcsMem(String str1, String str2, int n, int m, int dp[][]){
        //base case
        if(n==0 || m==0){
            return 0;
        }

        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return dp[n][m] = lcsMem(str1, str2, n-1, m-1, dp)+1;
        }else{
            return dp[n][m] = Math.max(lcsMem(str1, str2, n-1, m, dp), lcsMem(str1, str2, n, m-1, dp));
        }
    }

    public static int lcsTab(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[n][m];
    }

    //longest common substring
    public static int lcSubstring(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        int ans = 0;

        //initialization
        for(int i=0; i<n+1; i++){
            dp[i][0] = 0;
        }

        for(int j=0; j<m+1; j++){
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String str1 = "ABCDE";
        String str2 = "ABGCE";

        System.out.println(lcSubstring(str1, str2));
    }
}
