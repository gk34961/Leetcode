class Solution {
    public void setZeroes(int[][] matrix) {
        int x=1;
        int y=1;
        
        int r=matrix.length;//m
        int c=matrix[0].length;//n
        
        for(int i=0;i<c;i++) if(matrix[0][i]==0) x=0;
        for(int i=0;i<r;i++) if(matrix[i][0]==0) y=0;
        
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            } 
        }
        
        
        for(int i=1;i<r;i++){
            if(matrix[i][0]==0){
                for(int j=0;j<c;j++) matrix[i][j]=0;
            }
        }
        
        for(int i=1;i<c;i++){
            if(matrix[0][i]==0){
                for(int j=1;j<r;j++) matrix[j][i]=0;
            }
        }
        
        if(x==0){
            for(int j=0;j<c;j++) matrix[0][j]=0;
        }
        if(y==0){
            for(int j=0;j<r;j++) matrix[j][0]=0;
        }
        
        
    }
}
