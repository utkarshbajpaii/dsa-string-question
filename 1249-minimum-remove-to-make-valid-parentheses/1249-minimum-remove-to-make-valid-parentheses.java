class Solution {
    public String minRemoveToMakeValid(String s) {
        int n=s.length();
        HashSet<Integer> set=new HashSet<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(i);
            }else if(ch==')'){
                if(stack.isEmpty()){
                    set.add(i);
                }else{
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()){
            set.add(stack.pop());
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}