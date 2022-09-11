class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int speedAeffi[][]=new int[n][2];
        
        for(int i=0;i<n;i++){
            speedAeffi[i][0]=efficiency[i];
            speedAeffi[i][1]=speed[i];
        }
        
        Arrays.sort(speedAeffi,(a,b)->b[0]-a[0]);
        
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        long res=0;
        long sum=0;
        
        for(int el[]:speedAeffi){
            queue.add(el[1]);
            sum+=el[1];
            if(queue.size()>k) sum-=queue.remove();
            res=Math.max(res,sum*el[0]);
        }
        return (int)(res% 1000000007);
    }
}
