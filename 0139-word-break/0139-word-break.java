class Solution {
    int n;
    public boolean wordBreak(String s, List<String> wordDict) {
        n=s.length();
        Boolean[] t=new Boolean[n];
        return solve(s,0,wordDict,t);
    }
    public boolean solve(String s,int ind,List<String> wordDict,Boolean[] t){
        if(ind==n){
            return true;
        }
        if(t[ind]!=null){
            return t[ind];
        }
        for(int len=ind+1;len<=n;len++){
            String split=s.substring(ind,len);
            if(wordDict.contains(split)&&solve(s,len,wordDict,t)){
                return t[ind]=true;
            }
            // return t[ind]=false;
        }
         return t[ind]=false;
    }
}