class Solution{
    int findMinInsertions(String S){
        // code here
        int dp[][]=new int[S.length()+1][S.length()+1];
        String Rs=new StringBuilder(S).reverse().toString();
        for(int i=1;i<S.length()+1;i++){
           for(int j=1;j<S.length()+1;j++){
                if(S.charAt(i-1)==Rs.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            } 
        }
        
        return S.length()-dp[S.length()][S.length()];
    }
}
