class Solution {
    int n;
     public List<List<String>> partition(String s) {
        n=s.length();
        List<List<String>> result=new ArrayList<>();
        List<String> list=new ArrayList<>();
        backtrack(s,0,list,result);
        return result;
    }
    public void backtrack(String s,int idx,List<String> list,List<List<String>> result){
        if(idx==n){
            result.add(new ArrayList<>(list));
            return ;
        }
        for(int i=idx;i<n;i++){
            if(isPalindrome(s,idx,i)){
                list.add(s.substring(idx,i+1));
                backtrack(s,i+1,list,result);
                list.remove(list.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
    
