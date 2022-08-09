class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        Map<Integer,Long> map=new HashMap<>();
        long ans=1;
        map.put(arr[0],ans);
        
        for(int i=1;i<arr.length;i++){
            long sum=1;
            for(int j=0;j<i;j++){
                if(arr[i]%arr[j]==0 && map.containsKey(arr[i]/arr[j])){
                    sum=sum+(map.get(arr[i]/arr[j])*map.get(arr[j]));
                }
            }
            map.put(arr[i],sum);
            ans+=sum;
        }
        return (int)(ans%1000000007);
    }
}
