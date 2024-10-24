class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int n=allowed.length();
        int m=words.length;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(allowed.charAt(i));
        }
        int count=0;
        
        for(int i=0;i<m;i++){
            String str=words[i];
            int k=0;
            for(char ch:str.toCharArray()){
                if(!set.contains(ch)){
                    break;
                }
                k++;
                // count++;
            }
            if(k==str.length()){
                count++;
            }
        }
        return count;
    }
}