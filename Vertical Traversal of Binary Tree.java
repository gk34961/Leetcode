class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code here
        Queue<Node> q=new LinkedList<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Integer> loc=new LinkedList<>();
        loc.add(0);
        q.add(root);
    
        while(!q.isEmpty()){
            Node temp=q.poll();
            int val=loc.poll();
            
            ArrayList<Integer> list=map.get(val);
            if(list==null){
                list=new ArrayList<>();
                list.add(temp.data);}
            else
                list.add(temp.data);
            map.put(val,list);
            
            if(temp.left!=null) {q.add(temp.left); loc.add(val-1);}
            if(temp.right!=null) {q.add(temp.right); loc.add(val+1);}
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(Map.Entry<Integer,ArrayList<Integer>> e:map.entrySet()) {
            ArrayList<Integer> arr=e.getValue();
            res.addAll(arr);
        }
        return res;
    }
}

/*===================================================================================================================================================================*/
class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        Queue<Pair> q=new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        
        q.add(new Pair(0,root));
    
        while(!q.isEmpty()){
            Pair temp=q.poll();
            
            
            ArrayList<Integer> list=map.get(temp.hd);
            if(list==null){
                list=new ArrayList<>();
                list.add(temp.node.data);}
            else
                list.add(temp.node.data);
            map.put(temp.hd,list);
            
            if(temp.node.left!=null)  q.add(new Pair(temp.hd-1,temp.node.left));
            if(temp.node.right!=null) q.add(new Pair(temp.hd+1,temp.node.right));
        }
        
        ArrayList<Integer> res=new ArrayList<>();
        for(Map.Entry<Integer,ArrayList<Integer>> e:map.entrySet()) {
            ArrayList<Integer> arr=e.getValue();
            res.addAll(arr);
        }
        return res;
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
