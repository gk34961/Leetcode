class Solution
{
    public int LongestBitonicSequence(int[] nums)
    {
        // Code here
        int len=nums.length;
        
        int left[]=new int[len];
        Arrays.fill(left,1);
        
        int right[]=new int[len];
        Arrays.fill(right,1);
        
        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i])
                    left[i]=Math.max(left[i],1+left[j]);
            }
        }
        
        
        for(int i=len-2;i>=0;i--){
            for(int j=len-1;j>i;j--){
                if(nums[j]<nums[i])
                    right[i]=Math.max(right[i],1+right[j]);
            }
        }
        
        
        int max=0;
        for(int i=0;i<len;i++){
            max=Math.max(max,left[i]+right[i]-1);
        }
        return max;
    }
}
