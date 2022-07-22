class Solution {
    public int numEnclaves(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        
        //traveling through boundry from left & right & top & down.
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if((grid[i][j]==1)&&(i==0||j==0||i==r-1||j==c-1))
                    dfs(grid,i,j,r,c);
            }
        }
        
        //counting the no of 1 present in matrix after dfs traversal.
        
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
    
    void dfs(int[][] grid,int i,int j,int r,int c){
        
        if(i<0||i>=r||j<0||j>=c||grid[i][j]==0) return;
        grid[i][j]=0;
        
        dfs(grid,i+1,j,r,c);
        dfs(grid,i-1,j,r,c);
        dfs(grid,i,j+1,r,c);
        dfs(grid,i,j-1,r,c);
        
    }
}
