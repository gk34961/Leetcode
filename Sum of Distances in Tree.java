class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++) map.put(i,new ArrayList<>());
        int ans[]=new int[n];
        for(int edge[]:edges){
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        
        for(int i=0;i<n;i++){
            Queue<Integer> queue=new LinkedList<>();
            queue.add(i);

            int visited[]=new int[n];
            int sum=0;
            int level=-1;
            int prev=-1;

            visited[i]=1;

            while(!queue.isEmpty()){
                level++;
                int size=queue.size();
                for(int j=0;j<size;j++){
                    int val=queue.remove();
                    sum+=level;
                    for(int element:map.get(val)){
                        if(visited[element]==0){
                            visited[element]=1;
                            queue.add(element);
                        }
                    }
                }
            }
            ans[i]=sum;
        }
        return ans;
    }
}
