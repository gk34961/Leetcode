class Solution {
    public int numSquares(int n) {
        int count=0;
        int dp[]=new int[n+1];
        return recursion(n,dp);
    }
    
    int recursion(int n,int dp[]){
        if(n==0) return 0;
        if(dp[n]!=0) return dp[n];
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=Math.sqrt(n);i++){
            min=Math.min(min,1+recursion(n-(i*i),dp));
        }
        return dp[n]=min;
    }
}
