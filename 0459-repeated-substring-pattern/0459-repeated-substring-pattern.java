class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled=s+s;
        String repeated=doubled.substring(1,doubled.length()-1);
        return repeated.contains(s);
    }
}