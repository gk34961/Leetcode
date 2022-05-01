class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        Set<Integer> set=new HashSet<>();
        Map<Integer,Integer> map=new HashMap<>();
        
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0)
                count++;
            if(map.containsKey(sum))
                count+=map.get(sum);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
