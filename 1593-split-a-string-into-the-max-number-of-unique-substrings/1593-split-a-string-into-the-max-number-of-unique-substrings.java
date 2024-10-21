class Solution {
    public int maxUniqueSplit(String s) {
        HashSet<String> set=new HashSet<>();
        int[] max=new int[1];
        solve(s,0,set,0,max);
        return max[0];
    }
    public void solve(String s,int i,HashSet<String> set,int curr,int[] max){
        if(i==s.length()){
            max[0]=Math.max(max[0],curr);
            return ;
        }
        for(int j=i;j<s.length();j++){
            String sub=s.substring(i,j+1);
            if(!set.contains(sub)){
                set.add(sub);
                solve(s,j+1,set,curr+1,max);
                set.remove(sub);
            }
        }
    }
}