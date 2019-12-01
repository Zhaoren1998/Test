package DS10_动态规划;

public class ds11_最长回文子序列_动态规划 {
    /*	给定一个字符串s，找到其中最长的回文子序列。可以假设s的最大长度为1000。
        示例 1:
        输入:
        "bbbab"
        输出:

        4
        一个可能的最长回文子序列为 "bbbb"。

        示例 2:
        输入:

        "cbbd"
        输出:

        2
        一个可能的最长回文子序列为 "bb"。
    */
    public static void main(String[] args) {

    }
    /*动态规划递推式：
     * dp[i][j]表示字符串序列i到j之间的最大回文子串
     * 所以当i和j位置的字符相等时，dp[i][j]=dp[i+1][j-1]+2;
     * 不等时:                    dp[i][j]=max(dp[i+1][j],dp[i][j-1])*/
    public static int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
