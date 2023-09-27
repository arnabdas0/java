public class DpEditDistance {
    //O(n*m)
    public static int editDist(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];

        //initialization
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if(i==0){
                    dp[i][j] = j;
                }
                if(j==0){
                    dp[i][j] = i;
                }
            }
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                //same
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    //diff
                    int add = dp[i][j-1]+1;
                    int del = dp[i-1][j]+1;
                    int rep = dp[i-1][j-1]+1;
                    dp[i][j] = Math.min(add, Math.min(del, rep));
                }
            }
        }

        return dp[n][m];
    }
    public static void main(String[] args) {
        String word1 = "IEM";
        String word2 = "IBM";
        System.out.println(editDist(word1, word2));
    }
}
