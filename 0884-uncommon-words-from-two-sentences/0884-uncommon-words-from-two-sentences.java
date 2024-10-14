class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words1=s1.split(" ");
        String[] words2=s2.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(String word:words1){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String words:words2){
            map.put(words,map.getOrDefault(words,0)+1);
        }
        List<String> list=new ArrayList<>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                list.add(entry.getKey());
            }
        }
        String[] ans=new String[list.size()];
        ans=list.toArray(ans);
        return ans;

    }
}