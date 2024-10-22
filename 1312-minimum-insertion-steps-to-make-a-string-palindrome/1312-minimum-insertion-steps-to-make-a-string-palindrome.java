class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        int k= longestPalindromeSubseq(s);
        return n-k;
    }
       public int longestPalindromeSubseq(String s) {
        String reversed=new StringBuilder(s).reverse().toString();
        return lcs(s,reversed);
    }
    public int lcs(String s,String reverse){
        int n=s.length();
        int m=s.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<=m;j++){
            dp[0][j]=0;
        }
        for(int ind1=1;ind1<=n;ind1++){
            for(int ind2=1;ind2<=m;ind2++){
                if(s.charAt(ind1-1)==reverse.charAt(ind2-1)){
                    dp[ind1][ind2]=1+dp[ind1-1][ind2-1];
                }else{
                    dp[ind1][ind2]=Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
                }
            }
        }
        return dp[n][m];
    }
}