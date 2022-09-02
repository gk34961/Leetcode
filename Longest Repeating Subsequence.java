class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
        int dp[][]=new int[str.length()+1][str.length()+1];
        for(int i=1;i<str.length()+1;i++){
            for(int j=1;j<str.length()+1;j++){
                if(str.charAt(i-1)==str.charAt(j-1) && i!=j)
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[str.length()][str.length()];
    }
}
