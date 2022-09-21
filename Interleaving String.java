class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int dp[][]=new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<dp.length;i++)
			Arrays.fill(dp[i], -1);
		if(s1.length()+s2.length()!=s3.length()) return false;
		String res=new String();
		return isInterleaving(s1,0,s2,0,s3,res,0,dp);
    }
    private static boolean isInterleaving(String s1, int i, String s2, int j, String s3, String res,int index,int dp[][]) {
		
		if(i==s1.length() && j==s2.length() && res.equals(s3)) return true;
		boolean temp=false;
		
		if(dp[i][j]!=-1) return dp[i][j]==1?true:false;
		
		if(i<s1.length() && s3.charAt(index)==s1.charAt(i)) {
			res+=s1.charAt(i);
			temp|=isInterleaving(s1,i+1,s2,j,s3,res,index+1,dp);
			res=res.substring(0, res.length()-1);
			
		}
		if(j<s2.length() && s3.charAt(index)==s2.charAt(j)) {
			res+=s2.charAt(j);
			temp|=isInterleaving(s1,i,s2,j+1,s3,res,index+1,dp);
			res=res.substring(0, res.length()-1);
		}
		
		 dp[i][j]=temp?1:0;
		 return temp;
	}
}
