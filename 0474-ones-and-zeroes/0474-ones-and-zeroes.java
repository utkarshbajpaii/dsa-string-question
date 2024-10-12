class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp=new int[m+1][n+1][strs.length+1];
        return helper(strs,m,n,0,dp);
    }
    public int helper(String[] strs,int m,int n,int i,int[][][] dp){
        if(i>strs.length-1){
            return 0;
        }
        if(m<0||n<0){
            return 0;
        }
        if(m==0&&n==0){
            return 0;
        }
        if(dp[m][n][i]!=0){
            return dp[m][n][i];
        }
        int zeros=calZero(strs[i],'0');
        int ones=strs[i].length()-zeros;
        if(zeros<=m&&ones<=n){
           return  dp[m][n][i]=Math.max(1+helper(strs,m-zeros,n-ones,i+1,dp),helper(strs,m,n,i+1,dp));
        }else{
           return dp[m][n][i]=helper(strs,m,n,i+1,dp);
        }
    }
    public int calZero(String strs,char ch){
        int count=0;
        for(char temp:strs.toCharArray()){
            if(temp==ch){
                count++;
            }
        }
        return count;
    }
}