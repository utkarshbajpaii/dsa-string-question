class Solution {
    Map<Character,String> digitToLetters=new HashMap<>();
    List<String> resultList=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits==null||digits.length()==0){
            return resultList; 
        }
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
        generateCombinations(digits,0,new StringBuilder());
        return resultList;
    }
    public void generateCombinations(String digits,int idx,StringBuilder currentCombination){
        if(idx==digits.length()){
            resultList.add(currentCombination.toString());
            return;
        }
        char currentDigit=digits.charAt(idx);
        String letterOptions=digitToLetters.get(currentDigit);
        // if(letterOptions!=null){
                    for(int i=0;i<letterOptions.length();i++){
            char letter=letterOptions.charAt(i);
            currentCombination.append(letter);
            generateCombinations(digits,idx+1,currentCombination);
            currentCombination.deleteCharAt(currentCombination.length()-1);
        }
        // }

    }
}