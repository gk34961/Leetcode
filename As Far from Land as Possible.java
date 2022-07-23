class Solution {
    public int maxDistance(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        boolean visited[][]=new boolean[grid.length][grid[0].length];
        int direction[][]={{-1,0},{1,0},{0,-1},{0,1}};
        int result=Integer.MIN_VALUE;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    visited[i][j]=true;
                    q.add(new int[]{i,j});
                }
            }
        }
        
        while(!q.isEmpty()){
            int pos[]=q.poll();
            
            int x=pos[0];
            int y=pos[1];
            
            for(int dir[]:direction){
                int newx=x+dir[0];
                int newy=y+dir[1];
                
                if(isValid(newx,newy,grid.length,grid[0].length,visited)){
                    visited[newx][newy]=true;
                    grid[newx][newy]=grid[x][y]+1;
                    result=Math.max(result,grid[newx][newy]);
                    q.add(new int[]{newx,newy});
                }
            }
            
        }
        if(result==Integer.MIN_VALUE) return -1;
        return result-1;
    }
    boolean isValid(int nx,int ny,int r,int c,boolean[][] visited){
        if(nx<0||nx>=r||ny<0||ny>=c||visited[nx][ny]==true) return false;
        return true;
    }
}
