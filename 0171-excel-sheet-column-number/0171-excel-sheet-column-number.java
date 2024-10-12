class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for (int i=0;i<columnTitle.length();i++) {
            char a=columnTitle.charAt(i);
            ans = ans * 26 + (a - 'A' + 1);
        }
        return ans;
    }
}
