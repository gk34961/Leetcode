class Solution {
    int count=0;
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1) return -1;
        int direction[][]={{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};
        
        int r=grid.length;
        int c=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0,0,1});

       while(!q.isEmpty()){
           int pos[]=q.poll();
           int x=pos[0];
           int y=pos[1];
           int cost=pos[2];
           
           if(x==r-1 && y==c-1) return cost;
           
           for(int dir[]:direction){
               int newx=x+dir[0];
               int newy=y+dir[1];
               
               if(isValid(newx,newy,r,c,grid)){
                   grid[newx][newy]=1;
                   q.add(new int[]{newx,newy,cost+1});
               }
           }
       }
       return -1;
    }
    boolean isValid(int i,int j,int r,int c,int [][]grid){
        if(i<0||i>=r||j<0||j>=c||grid[i][j]==1) return false;
        return true;
    }
}
