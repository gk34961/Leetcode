class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        // Add your code here
        boolean visited[]=new boolean[V];
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.val-b.val); 
        pq.add(new Pair(0,0));
        int ans=0;
        
        while(!pq.isEmpty()){
            Pair p=pq.remove();
            
            int node=p.node;
            int val=p.val;
            
            if(visited[node]) continue;
            ans+=val;
            visited[node]=true;
            
            ArrayList<ArrayList<Integer>> list=adj.get(node);
            for(ArrayList<Integer> l:list){
                int n=l.get(0);
                int v=l.get(1);
                if(!visited[n])
                    pq.add(new Pair(n,v));
            }
        }
        
        return ans;
    }
    
}
class Pair{
    int node;
    int val;
    Pair(int node,int val){
        this.node=node;
        this.val=val;
    }
}
