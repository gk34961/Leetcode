class Solution {
    int maxLen(int[] arr, int n)
    {
        // Your code here
       Map<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++)
            arr[i] = (arr[i] == 0) ? -1 : 1;
       int sum=0;
       int len=0;
       for(int i=0;i<n;i++){
           sum+=arr[i];
            if(sum==0) len=Math.max(len,i+1);
            if(map.containsKey(sum)){
                len=Math.max(len,i-map.get(sum));
            }
            if(!map.containsKey(sum))
                map.put(sum,i);
       }
       return len;
    }
}
