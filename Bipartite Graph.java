//BFS SOLUTION
class Solution
{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        //-1=> no color
        // 0 red
        // 1 green
        
        int[] color=new int[V];
        for(int i=0;i<V;i++)
            color[i]=-1;
            
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(bfs(adj,i,color)==false) return false;
            }
        }
        return true;
    }
    
    boolean bfs(ArrayList<ArrayList<Integer>>adj,int node,int[] color){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        color[node]=1;
        
        while(!q.isEmpty()){
            int val=q.poll();
            
            for(int i:adj.get(val)){
                    if(color[i]==-1){
                        color[i]=1-color[val];
                         q.add(i);
                    }
                    else if(color[i]==color[val]){
                        return false;
                       
                    } 
            }
        }
        return true;
    }
}
