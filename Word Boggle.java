class Solution
{
    public String[] wordBoggle(char board[][], String[] dictionary)
    {
        // Write your code here
        
        List<String> list=new ArrayList<>();
        int i=0;
        for(String dict:dictionary){
            if(check(dict,board)) list.add(dict);
        }
        
        String result[]=new String[list.size()];
        for(String s:list)  result[i++]=s;
        return result;
    }
   boolean check(String s,char board[][]){
        int r=board.length;
        int c=board[0].length;
        boolean visit[][]=new boolean[r][c];
        int index=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==s.charAt(index) && backtracking(i,j,index,board,visit,s)) 
                    return true;
            }
        }
        return false;
    }
    boolean backtracking(int i,int j,int index,char board[][],boolean visit[][],String s){ 
        if(index==s.length()) return true;
        if(i<0||j<0||i>=board.length||j>=board[0].length||visit[i][j]||s.charAt(index)!=board[i][j]) return false;
        
        visit[i][j]=true;
        
        if(backtracking(i-1,j-1,index+1,board,visit,s)||
        backtracking(i-1,j,index+1,board,visit,s)||
        backtracking(i-1,j+1,index+1,board,visit,s)||
        backtracking(i,j-1,index+1,board,visit,s)||
        backtracking(i,j+1,index+1,board,visit,s)||
        backtracking(i+1,j-1,index+1,board,visit,s)||
        backtracking(i+1,j,index+1,board,visit,s)||
        backtracking(i+1,j+1,index+1,board,visit,s)) return true;
        
        visit[i][j]=false;
        
        return false;  
    }
}
