class Solution {
   int[][] dir = {{0,-1}, {-1,0}, {0,1}, {1,0}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        int m = heights.length, n = heights[0].length, i, j;
        boolean[][] pacific = new boolean[m][n];
        for(i = 0; i < n; i++) bfs(heights, 0, i, pacific); // first row 
        for(i = 0; i < m; i++) bfs(heights, i, 0, pacific); // first column
        
        boolean[][] atlantic = new boolean[m][n];
        for(i = n-1; i >= 0; i--) bfs(heights, m-1, i, atlantic); // last row
        for(i = m-1; i >= 0; i--) bfs(heights, i, n-1, atlantic); // last column
        
        // find the cell of rain water that can flow to both ocean
        List<List<Integer>> output = new ArrayList<>();
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                if(atlantic[i][j] && pacific[i][j])
                    output.add(List.of(i, j));
            }
        }
        return output;
    }
    
    void bfs(int[][] heights, int r, int c, boolean[][] ans){
        
        ans[r][c] = true; // mark reachable
        for(int d[]:dir){
            
            int newr = r+d[0];
            int newc = c+d[1];
            
            if(newr<0 || newc<0 || newr>=heights.length || 
               newc>=heights[0].length || ans[newr][newc] || 
               heights[newr][newc] < heights[r][c])
                continue;
            
            bfs(heights, newr, newc, ans);
        }
    }
}
