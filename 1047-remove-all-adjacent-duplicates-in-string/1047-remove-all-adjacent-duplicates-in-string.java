class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            boolean insert=false;
                while(!st.isEmpty()&&st.peek()==s.charAt(i)){
                    insert=true;
                st.pop();
                }
                st.push(s.charAt(i));
                if(insert==true){
                    st.pop();
                }

        }
        while(!st.isEmpty()){
            char ch=st.pop();
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}