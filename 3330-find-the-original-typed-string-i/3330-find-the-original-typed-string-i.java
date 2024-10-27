class Solution {
    public int possibleStringCount(String word) {
        Set<Character> set=new HashSet<>();
        int n=word.length();
        int same=0;
        for(int i=0;i<n;i++){
            if(!set.isEmpty()&&set.contains(word.charAt(i))&&word.charAt(i-1)==word.charAt(i)){
                same++;
            }
            set.add(word.charAt(i));
        }
        return same+1;
    }
}