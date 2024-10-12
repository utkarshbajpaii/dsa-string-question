class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> hm=new HashMap<>();
        HashMap<Character,Boolean> hn=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(hm.containsKey(c1)==true){
                if(hm.get(c1)!=c2){
                    return false;
                }}else{
                    if(hn.containsKey(c2)==true){
                        return false;
                    }else{
                        hm.put(c1,c2);
                        hn.put(c2,true);
                    }
                }
            }
        
        return true;
    }
}