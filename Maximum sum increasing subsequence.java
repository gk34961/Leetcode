class Solution{
    static int maxSquare(int n, int m, int mat[][]){
        // code here
        int ans=0;
        int dp[][]=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||j==0){
                    if(mat[i][j]==1)
                        dp[i][j]=1;
                }else{
                    if(mat[i][j]>0)
                        dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
                ans=Math.max(ans,dp[i][j]);
            }
        }
        
        
        return ans;
    }
}
