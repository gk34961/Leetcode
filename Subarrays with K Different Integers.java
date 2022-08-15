class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return function(nums,k)-function(nums,k-1);
    }
    int function(int nums[],int k){
        int i=0;
        int res=0;
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int j=0;j<nums.length;j++){
            
            if(map.getOrDefault(nums[j],0)==0) k--;
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            
            while(k<0){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0) k++;
                i++;
            }
            res+=j-i+1;
        }
        return res;
    }
}
