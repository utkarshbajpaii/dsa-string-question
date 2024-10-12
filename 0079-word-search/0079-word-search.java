class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        int index=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(index)){
                    if(backtrack(board, word, i, j, index, m, n)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean backtrack(char[][] board,String word,int i,int j,int index,int m,int n){
        if(index==word.length()){
            return true;
        }
        if(i<0||j<0||i==m||j==n||board[i][j]!=word.charAt(index)||board[i][j]=='!'){
            return false;
        }
        char c=board[i][j];
        board[i][j]='!';
        boolean top=backtrack(board,word,i-1,j,index+1,m,n);
        boolean right=backtrack(board,word,i,j+1,index+1,m,n);
        boolean bottom=backtrack(board,word,i+1,j,index+1,m,n);
        boolean left=backtrack(board,word,i,j-1,index+1,m,n);
        board[i][j]=c;
        return top||right||bottom||left;
    }
}