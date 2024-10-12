class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxFreq=0;
        int count=0;
        int[] freq=new int[26];
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            freq[ch-'A']++;
            maxFreq=Math.max(maxFreq,freq[ch-'A']);
            while(right-left+1-maxFreq>k){
                freq[s.charAt(left++)-'A']--;
            }
            count=Math.max(count,right-left+1);
        }
        return count;
    }
}