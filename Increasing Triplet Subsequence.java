class Solution {
    public boolean increasingTriplet(int[] nums) {
        int one=Integer.MAX_VALUE;
        int two=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(one>=nums[i]) one=nums[i];
            else if(two>=nums[i]) two=nums[i];
            else return true;
        }
        return false;      
    }
}
