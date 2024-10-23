class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int count=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
        }
        max=count;
        for(int i=k;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i-k);
            if(isVowel(ch1)){
                count++;
            }
            if(isVowel(ch2)){
                count--;
            }
            max=Math.max(max,count);
        }
        return max;
    }
    public boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}