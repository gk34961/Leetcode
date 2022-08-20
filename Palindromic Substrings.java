class Solution {
    public int countSubstrings(String s) {
        boolean dp[][]=new boolean[s.length()][s.length()];
        int count=0;
        
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                int x=j;
                int y=j+i;
                if(y>=s.length()) break;
                
                if(x==y) {
                    dp[x][y]=true;
                    count++;
                }
                else if(Math.abs(x-y)==1){
                    if(s.charAt(x)==s.charAt(y)) {dp[x][y]=true; count++;}
                    else  dp[x][y]=false;
                }
                else{
                    if(s.charAt(x)!=s.charAt(y)) 
                        dp[x][y]=false;
                    else{
                        dp[x][y]=dp[x+1][y-1];
                        if(dp[x][y]) count++;
                    } 
                        
                }
            }
        }
        return count;
    }
}
