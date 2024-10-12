class Solution {
    public int compareVersion(String version1, String version2) {
        List<String> list=getTokens(version1);
        List<String> list1=getTokens(version2);
        int m=list.size();
        int n=list1.size();
        int i=0;
        while(i<m||i<n){
            int a=i<m?Integer.parseInt(list.get(i)):0;
            int b=i<n?Integer.parseInt(list1.get(i)):0;
            if(a>b){
                return 1;
            }
            else if(a<b){
                return -1;
            }
            else{
                i++;
            }
            // return 0;
        }
        return 0;
    }
    public List<String> getTokens(String version){
        String[] tokens=version.split("\\.");
        List<String> tokened=new ArrayList<>();
        for(String token:tokens){
            tokened.add(token);
        }
        return tokened;
    }
}