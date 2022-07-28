class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int r=maze.length;
        int c=maze[0].length;
        int step=0;
        int direction[][]={{-1,0},{1,0},{0,-1},{0,1}};
        
        boolean visited[][]=new boolean[r][c];
        visited[entrance[0]][entrance[1]]=true;
        
        Queue<int[]> q=new LinkedList<>();
        q.offer(entrance);
        
        while(!q.isEmpty()){
            int s=q.size();
            step++;
            
            while(s-->0){
            int pos[]= q.poll();
                for(int dir[]:direction){
                    
                    int x=dir[0]+pos[0];
                    int y=dir[1]+pos[1];
                
                    if(x<0||y<0||x>=r||y>=c) continue;
                    if(visited[x][y]||maze[x][y]=='+') continue;
                
                    if(x==0||x==r-1||y==0||y==c-1) return step;
                    q.offer(new int[]{x,y});
                
                    visited[x][y]=true;
                }
            }
        }
        return -1;
    }
}
