class Pair{
    String first;
    int second;
    Pair(String _first,int _second){
        this.first=_first;
        this.second=_second;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        Set<String> set=new HashSet<>();
        for(int i=0;i<wordList.size();i++){
            set.add(wordList.get(i));
        }
        set.remove(beginWord);
        while(!q.isEmpty()){
            String word=q.peek().first;
            int steps=q.peek().second;
            q.remove();
            if(word.equals(endWord)==true){
                return steps;
            }
            for(int i=0;i<word.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char replaceCharArray[]=word.toCharArray();
                    replaceCharArray[i]=ch;
                    String replaceWord=new String(replaceCharArray);
                    if(set.contains(replaceWord)==true){
                        set.remove(replaceWord);
                        q.add(new Pair(replaceWord,steps+1));
                    }
                }
            }
        }
        return 0;
    }
}