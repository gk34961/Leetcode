class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int start=i+1;
            int end=nums.length-1;
            
            while(start<end){
                int sum=nums[i]+nums[start]+nums[end];
                
                if(sum==0) {
                    result.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    start++;
                    while(nums[start]==nums[start-1] && start<end) start++;
                }
                else if(sum>0) end--;
                else start++;
            }
            
        }
        return result;
    }
}
