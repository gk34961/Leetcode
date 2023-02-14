class GfG
{
    Node result=null;
    Node buildBalancedTree(Node root) 
    {
        //Add your code here.
        List<Node> list=new ArrayList<>();
        recursion(list,root);
        return balancedBst(list,0,list.size()-1);
    }
    Node balancedBst(List<Node> list,int start,int end){
        if(start>end) return null;
        
        int mid=(start+end)/2;
        Node node=list.get(mid);
        
        node.left=balancedBst(list,start,mid-1);
        node.right=balancedBst(list,mid+1,end);
        
        return node;
        
    }
    void recursion(List<Node> list,Node root){
        if(root==null) return;
        recursion(list,root.left);
        list.add(root);
        recursion(list,root.right);
    }
}
