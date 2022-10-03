class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        
        int ans=arr[n-1]-arr[0];
        
        for(int i=1;i<n;i++){
            int min=Math.min(arr[0]+k,arr[i]-k);
            int max=Math.max(arr[n-1]-k,arr[i-1]+k);
            ans=Math.min(ans,max-min);
        }
        
        return ans;
    }
}
