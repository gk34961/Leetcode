class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        
        for(int i=1;i<s1.length()+1;i++){
            for(int j=1;j<s2.length()+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        
        StringBuilder sb = new StringBuilder();
		int i = s1.length();
		int j = s2.length();
        
		while (i > 0 && j > 0) {
			if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
				sb.append(s1.charAt(i - 1));
				i--;
				j--;
			} else if (dp[i - 1][j] > dp[i][j - 1]) {
				sb.append(s1.charAt(i - 1));
				i--;
			} else {
				sb.append(s2.charAt(j - 1));
				j--;
			}
		}
		while (i > 0) {
			sb.append(s1.charAt(i - 1));
			i--;
		}
		while (j > 0) {
			sb.append(s2.charAt(j - 1));
			j--;
		}

		return sb.reverse().toString();
    }
}
