class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] c=str.toCharArray();
            Arrays.sort(c);
            String sortedString=new String(c);
            if(map.containsKey(sortedString)==false){
                map.put(sortedString,new ArrayList<>());
            }
            map.get(sortedString).add(str);
        }
        result.addAll(map.values());
        return result;
    }
}