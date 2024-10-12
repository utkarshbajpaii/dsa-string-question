class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0;
        int index=0;
        while(i<n){
            char curr_char=chars[i];
            int count=0;
            while(i<n&&chars[i]==curr_char){
                i++;
                count++;
            }
            chars[index++]=curr_char;
            if(count>1){
                String countstr=Integer.toString(count);
                for(char ch:countstr.toCharArray()){
                    chars[index++]=ch;
                }
            }
        }
        return index;
    }
}