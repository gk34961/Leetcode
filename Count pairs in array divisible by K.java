class Solution
{
    public static long countKdivPairs(int arr[], int n, int k)
    {
        //code here
        long count=0;
        int reault=0;
            
        Map<Integer,Long> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            int rem=arr[i]%k;
            if(rem!=0)
                count+=map.getOrDefault(k-rem,0l);
            else
                count+=map.getOrDefault(0,0l);
            map.put(rem,map.getOrDefault(rem,0l)+1);
        }
        return count;
    }
}
