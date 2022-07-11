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


//DFS  SOLUTION
class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int color[]=new int[n];
        for(int i=0;i<n;i++) color[i]=-1;
        
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(dfs(color,graph,i)==false) return false;
            }
        }
        return true;
    }
    
    boolean dfs( int color[],int[][] graph,int node){
        for(int n:graph[node]){
            if(color[n]==-1){
                color[n]=1-color[node];
                if(!dfs(color,graph,n)){
                    return false;
                }
            }
            else if(color[n]==color[node]){
                return false;
            }
        }
        return true;
    }
}
