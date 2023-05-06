class Solution {
    int mod=1000000007;
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int count=0;
        int start=0;
        int end=nums.length-1;
        int[] power2 = new int[nums.length + 1];
        power2[0] = 1;

        for (int i = 1; i <= nums.length; i++)
            power2[i] = (power2[i - 1] * 2) % mod;

        while(start<=end){
            if((nums[start]+nums[end])<=target) {count=(count+power2[end-start])%mod;start++;}
            else end--;
            
        }
        return count;
    }
}
