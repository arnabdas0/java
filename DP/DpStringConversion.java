package DP;

public class DpStringConversion {
    public static int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][m];
    }

    public static void stringConversion(String str1, String str2) {
        int lcs = lcs(str1, str2);
        int delCount = str1.length() - lcs;
        System.out.println("Delete Count: " + delCount);
        int insertCount = str2.length() - lcs;
        System.out.println("Insert Count: " + insertCount);
        int totalCount = delCount + insertCount;
        System.err.println("Total Count: " + totalCount);
    }

    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";
        stringConversion(str1, str2);
    }
}
