class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int max=0;
        
        for(int row=-n+1;row<n;row++){
            for(int col=-n+1;col<n;col++){
                max=Math.max(max,findOverlap(img1,img2,row,col));
            }
        }
        
        return max;
    }
    
    int findOverlap(int[][] img1, int[][] img2,int rowOff,int colOff){
        int n=img1.length;
        
        int count=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int nx=i+rowOff;
                int ny=j+colOff;
                
                if(nx<0||ny<0||nx>=n||ny>=n) continue;
                if(img1[i][j]==1 && img2[nx][ny]==1) count++; 
            }
        }
        return count;
    }
}
