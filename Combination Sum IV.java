class Solution {
    int dp[];
    public int combinationSum4(int[] nums, int target) {
        //top-down approach
        
        dp=new int[target+1];
        Arrays.fill(dp,-1);
        dp[0]=1;
        helper(nums,target);
        return dp[target];
    }
    int helper(int[] nums, int target){
        if(dp[target]!=-1) return dp[target];
        int res=0;
        
        for(int num:nums){
            if(num<=target)
                res+=helper(nums,target-num); 
        }
        return dp[target]=res;
    }
}
