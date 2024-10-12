class Solution {
    public int countSegments(String s) {
        if(s.trim().equals("")){
            return 0;
        }
       String[] ans=s.trim().split("\\s+");
       return ans.length; 
    }
}