class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix ==  null || matrix[0].length == 0 || 
           matrix[0] == null || matrix[0].length == 0)
            return 0;
        
        int n = matrix.length;
        int l = matrix[0][0], r = matrix[n-1][n-1];
        
        while(l < r){
            int m = l + (r - l) / 2;
	
            if(smallerOrEqual(matrix, m, n) < k) 
                l = m + 1;
            else
                r = m;
        }
        
        return l; 
    }
    
    public int smallerOrEqual(int[][] matrix, int m, int n){
        int row = 0, col = n - 1, count = 0;
        while(row < n && col >= 0){
            if(matrix[row][col] <= m){ 
                row++;
                count += (col + 1); 
            }else{
                col--;
            }
        }
        return count;
    }
}
