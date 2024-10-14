class Solution {
    public boolean backspaceCompare(String s, String t) {
       Stack<Character> st=new Stack<>();
       Stack<Character> stt=new Stack<>();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='#'){
            if(!st.isEmpty()){
                st.pop();
            }
        }
        else{
            st.push(s.charAt(i));
        }
       } 
       for(int j=0;j<t.length();j++){
        if(t.charAt(j)=='#'){
            if(!stt.isEmpty()){
                stt.pop();
            }
        }else{
            stt.push(t.charAt(j));
        }
       }
       if(st.isEmpty()&&stt.isEmpty()){
        return true;
       }
       if(st.size()>stt.size()||st.size()<stt.size()){
        return false;
       }
       while(!st.isEmpty()&&!stt.isEmpty()){
        char c=st.pop();
        char ch=stt.pop();
        if(ch!=c){
            return false;
        }
       }
       return true;
    }
}