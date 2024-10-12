

class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(s, p, n - 1, m - 1, dp) == 1;
    }

    public int helper(String s, String p, int i, int j, int[][] dp) {
        // Base case: Both strings are fully processed
        if (i < 0 && j < 0) {
            return 1;
        }
        // If pattern is still left but the string is exhausted
        if (i < 0 && j >= 0) {
            return isAllStar(p, j) ? 1 : 0;
        }
        // If the string is still left but the pattern is exhausted
        if (j < 0 && i >= 0) {
            return 0;
        }

        // Check if this subproblem is already solved
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // Case 1: Characters match or pattern has '?' wildcard
        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
            return dp[i][j] = helper(s, p, i - 1, j - 1, dp);
        }

        // Case 2: Pattern has '*' wildcard
        if (p.charAt(j) == '*') {
            // '*' can match zero or more characters
            return dp[i][j] = (helper(s, p, i - 1, j, dp) == 1 || helper(s, p, i, j - 1, dp) == 1) ? 1 : 0;
        }

        // Case 3: No match
        return dp[i][j] = 0;
    }

    // Check if the remaining part of the pattern is all '*'
    public boolean isAllStar(String p, int j) {
        for (int k = 0; k <= j; k++) {
            if (p.charAt(k) != '*') {
                return false;
            }
        }
        return true;
    }
}
