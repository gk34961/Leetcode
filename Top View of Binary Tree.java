class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(0,root));
        Map<Integer,Integer> map=new TreeMap<>();
       
        
        while(!q.isEmpty()){
            Pair p=q.poll();
            
            if(!map.containsKey(p.hd))
                map.put(p.hd,p.node.data);
            if(p.node.left!=null)
                q.add(new Pair(p.hd-1,p.node.left));
            if(p.node.right!=null)
                q.add(new Pair(p.hd+1,p.node.right));
        }
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(Map.Entry<Integer,Integer> m:map.entrySet())
            list.add(m.getValue());
        
        return list;
    }
    static class Pair{
        int hd;
        Node node;
        Pair(int hd,Node node){
            this.hd=hd;
            this.node=node;
        }
    }
}
