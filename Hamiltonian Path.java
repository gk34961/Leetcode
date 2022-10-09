class Solution 
{ 
    boolean check(int n, int m, ArrayList<ArrayList<Integer>> Edges) 
    { 
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<=n;i++)
        adj.add(new ArrayList<>());
        for(ArrayList<Integer> e:Edges){
            adj.get(e.get(0)).add(e.get(1));
            adj.get(e.get(1)).add(e.get(0));
        }
    
    for(int i =0;i<n;i++){
       boolean[] vis = new boolean[n+1];
       vis[i] = true;
       if(dfs(i,adj,1,vis))
       return true;
    }
    return false;
    }
    boolean dfs(int i,  ArrayList<ArrayList<Integer>> adj,int c,boolean[] vis){
        if(c == adj.size()-1) return true;
        for(int j:adj.get(i)){
            if(!vis[j]){
                vis[j] = true;
                if(dfs(j,adj,c+1,vis)) return true;
                vis[j] = false;
            }
        }
        return false;
    }
}
