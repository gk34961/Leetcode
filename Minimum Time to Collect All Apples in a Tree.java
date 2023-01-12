class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++) map.put(i,new ArrayList<>());

        for(int edge[]:edges){
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        return dfs(map,visited,hasApple,0);
    }

    int dfs(Map<Integer,List<Integer>> map,boolean visited[],List<Boolean> hasApple,int start){
        visited[start]=true;
        int stepCount=0;
        for(int node:map.get(start)){
            if(!visited[node])
                stepCount+=dfs(map,visited,hasApple,node);
        }
        
        if(start==0) return stepCount;
        if(hasApple.get(start) ||stepCount>0)  stepCount=stepCount+2;
        return stepCount;
    }
}
