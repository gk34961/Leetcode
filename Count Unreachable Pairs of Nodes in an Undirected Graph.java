class Solution {
    int count=1;
    public long countPairs(int n, int[][] edges) {
        
        long totalSum=0;
        long sum=0;

        ArrayList<ArrayList<Integer>> map = new ArrayList<>();
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++) map.add(new ArrayList<>());

        for(int edge[]:edges){
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        //System.out.println("map ="+map);
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count=1;
                dfs(i,map,visited);
                
                totalSum+=(sum*count);
                sum+=count;
                //System.out.println("totalSum="+totalSum+" "+"sum ="+sum);
            }
        }
        
        return totalSum;
    }
    void dfs(int u,ArrayList<ArrayList<Integer>> map,boolean visited[]){
        visited[u]=true;
        for(int v:map.get(u)){
            if(!visited[v]){
                count++;  
                //System.out.println("u="+u+" "+"v ="+v); 
                dfs(v,map,visited);
            }
        }
    }
}
