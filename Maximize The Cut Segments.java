class Solution
{
    //Function to find the maximum number of cuts.
    int count =0;
    public int maximizeCuts(int n, int x, int y, int z)
    {
       //Your code here
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        
        int result=function(n,x,y,z,dp);
        if(result<0) return 0;
        return result;
    }
    
    int function(int n, int x, int y, int z,int dp[]){
        if(n<=0) return 0;
        if(dp[n]!=-1) return dp[n];
        
        int max,may,maz;
        max=may=maz=Integer.MIN_VALUE;
       
        if(n>=x)    max =function(n-x,x,y,z,dp);
        if(n>=y)    may=function(n-y,x,y,z,dp);
        if(n>=z)    maz= function(n-z,x,y,z,dp);
        
        return dp[n]=1+Math.max(max, Math.max(may,maz));
    }
}
