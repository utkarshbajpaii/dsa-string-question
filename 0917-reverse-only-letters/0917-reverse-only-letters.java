class Solution {
    public String reverseOnlyLetters(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        char[] ch=s.toCharArray();
        while(i<j){
            if(!Character.isLetter(ch[i])){
                i++;
            }
            else if(!Character.isLetter(ch[j])){
                j--;
            }
            else{
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}