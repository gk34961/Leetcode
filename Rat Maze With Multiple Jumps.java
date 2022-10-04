class Solution
{
    public int[][] ShortestDistance(int[][] matrix)
    {
        // Code here
        int[][] track=new int[matrix.length][matrix[0].length];
        
        if(recursion(matrix,track,0,0)) return track;
        else return new int[][]{{-1}};
        
    }
    
    boolean recursion(int[][] matrix, int[][] track,int i,int j){
        if(i>=matrix.length||j>=matrix.length) return false;
        track[i][j]=1;
        if(i==matrix.length-1 && j==matrix.length-1) return true;
        
        int val=matrix[i][j];
        for(int p=1;p<=val;p++){
            if(recursion(matrix,track,i,j+p)) return true;
            if(recursion(matrix,track,i+p,j)) return true;
            
        }
        track[i][j]=0;
        return false;
    }
}
