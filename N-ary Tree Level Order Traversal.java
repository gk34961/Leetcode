class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root==null) return new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        recursion(q,list);
        return list;
    }
    void recursion(Queue<Node> q, List<List<Integer>> list){
        
        while(!q.isEmpty()){
            List<Integer> tlist=new ArrayList<>();
            int size=q.size();
            
            for(int i=0;i<size;i++){
                Node temp=q.remove();
                tlist.add(temp.val);
                
                for(Node node:temp.children){
                    q.add(node);
                }
            }
            list.add(tlist);
        }
    }
}
