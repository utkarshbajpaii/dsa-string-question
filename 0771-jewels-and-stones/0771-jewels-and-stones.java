class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            set.add(jewels.charAt(i));
        }
        int ans=0;
        for(int j=0;j<stones.length();j++){
            if(set.contains(stones.charAt(j))){
                ans++;
            }
        }
        return ans;
    }
}