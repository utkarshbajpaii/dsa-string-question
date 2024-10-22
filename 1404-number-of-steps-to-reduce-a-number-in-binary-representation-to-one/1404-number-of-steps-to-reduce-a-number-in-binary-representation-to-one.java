class Solution {
    public int numSteps(String s) {
        int n=s.length();
        int op=0;
        int carry=0;
        for(int i=n-1;i>=1;i--){
            if(((Character.getNumericValue(s.charAt(i)))+carry)%2==1){
                op+=2;
                carry=1;
            }else{
                op+=1;
            }
        }
        return op+carry;
    }
}