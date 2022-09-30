class solve
{
    //Function to find the maximum possible amount of money we can win.
    static long countMaximum(int arr[], int n)
    {
        // Your code here
        int dp[][]=new int[n][n];
        return recursion(arr,0,n-1,dp);
    }
    static int recursion(int arr[],int i,int j,int dp[][]){
        if(i>j) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        int one=arr[i]+Math.min(recursion(arr,i+2,j,dp),recursion(arr,i+1,j-1,dp));
        int two=arr[j]+Math.min(recursion(arr,i,j-2,dp),recursion(arr,i+1,j-1,dp));
        
        return dp[i][j]=Math.max(one,two);
    }
}
