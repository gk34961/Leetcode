class Solution{
    int longSubarrWthSumDivByK(int arr[], int n, int k)
    {
        
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
 
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            
            int mod = ((sum % k) + k) % k;
 
            if (mod == 0)
                max = i + 1;
 
            if (!map.containsKey(mod))
                map.put(mod, i);
            else {
                int sz = i - map.get(mod);
                max = Math.max(max, sz);
            }
        }
 
        return max;
    }
}
