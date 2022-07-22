class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result=new ArrayList<>();
        int n=graph.length;
        List<Integer> list=new  ArrayList<>();
        
        if (graph == null || graph.length == 0 || graph[0].length == 0) 
            return result;
        
        dfs(graph,list,result,0,n-1);
        return result;
    }
    
    void dfs(int[][] graph,List<Integer> list,List<List<Integer>> result,int source,int destination){
        
        list.add(source);
        
        if(source==destination){
            result.add(new ArrayList(list));
            list.remove(list.size()-1);
            return;
        }
        
        for(int val:graph[source]){
            dfs(graph,list,result,val,destination);
        }
        list.remove(list.size()-1);
    }
}
