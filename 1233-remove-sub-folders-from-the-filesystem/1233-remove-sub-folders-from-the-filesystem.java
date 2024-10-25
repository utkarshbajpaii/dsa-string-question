class Solution {
    public List<String> removeSubfolders(String[] folder) {
     List<String> ans=new ArrayList<>();
     Set<String> set=new HashSet<>(Arrays.asList(folder));
     for(String f:folder){
        boolean isSubFolder=false;
        String prefix=f;
        while(!prefix.isEmpty()){
            int pos=prefix.lastIndexOf('/');
            if(pos==-1){
                break;
            }
            prefix=prefix.substring(0,pos);
            if(set.contains(prefix)){
                isSubFolder=true;
                break;
            }
        }
        if(!isSubFolder){
            ans.add(f);
        }
     }
     return ans;
    }
}