class Solution{
    int longSubarrWthSumDivByK(int arr[], int n, int k)
    {
        // Complete the function
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int rem = 0;
        int mLen = -1;
        map.put(0  , -1);
        
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
            rem = sum % k;
            if(rem < 0) rem+=k;
            
            if(map.containsKey(rem)){
                mLen = Math.max(mLen , i - map.get(rem));
            }else{
                map.put(rem , i);
            }
        }
       return mLen;
    }
}
