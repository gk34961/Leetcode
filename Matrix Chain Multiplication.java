class Solution{
    
    static int matrixMultiplication(int n, int p[])
    {
        // code here
        int dp[][]=new int[501][501];
        for(int i=0;i<501;i++)
            Arrays.fill(dp[i],-1);
            
        return solve(p,1,n-1,dp);
        
    }
    static int solve(int arr[],int i,int j,int dp[][]){
        if(i>=j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp=solve(arr,i,k,dp)+solve(arr,k+1,j,dp)+arr[i-1]*arr[k]*arr[j];
            if(temp<ans)
                ans=temp;
        }
        return dp[i][j]=ans;
    }
}
