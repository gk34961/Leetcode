class Solution {
    boolean visited[][];
    public boolean exist(char[][] board, String word) {
    visited=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0))
                    if(dfs(i,j,board.length,board[0].length,word,board,0)) return true;
            }
        }
        return false;
    }
    
    boolean dfs(int x,int y,int r,int c,String w,char[][] board,int index){
        if(w.length()==index) return true;
        
        if(x<0||y<0||x>=r||y>=c||visited[x][y]||board[x][y]!=w.charAt(index)) return false;
        visited[x][y]=true;
        
        if(dfs(x,y+1,r,c,w,board,index+1)||dfs(x+1,y,r,c,w,board,index+1)
           ||dfs(x,y-1,r,c,w,board,index+1)||dfs(x-1,y,r,c,w,board,index+1)) 
                return true;
        
        visited[x][y]=false;
        
        return false;
    }
}
