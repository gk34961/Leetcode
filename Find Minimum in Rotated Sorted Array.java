class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low =0 , high = nums.length-1; 
        
        while(low<=high){
          int mid = low + (high-low)/2 ; 
          int prev = (mid-1 + n)  %n , next = (mid+1)%n ;
          if(nums[mid]<=nums[prev] && nums[mid]<=nums[next]) return nums[mid];
          else if (nums[mid]<=nums[high]) high = mid-1 ; 
          else if (nums[mid]>=nums[low])  low=mid+1 ; 
      }
      return -1; 
    }
}
