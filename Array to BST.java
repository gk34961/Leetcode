class Solution
{
    int i=0;
    public int[] sortedArrayToBST(int[] nums)
    {
        // Code here 
        int start=0;
        int end=nums.length-1;
        int result[]=new int[nums.length];
        findMiddle(nums,start,end,result);
        return result;
    }
    
     void findMiddle(int[] nums,int start,int end,int result[]){
        if(start>end) return;
        int mid=start+(end-start)/2;
        result[i++]=nums[mid];
        findMiddle(nums,start,mid-1,result);
        findMiddle(nums,mid+1,end,result);
    }
}
