class Tree
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // add your code here
        if(root==null) return 1;
        if(root.left==null && root.right==null) return 1;
        int leftAns=isSumProperty(root.left);
        int rightAns=isSumProperty(root.right);
        
        if(leftAns==1 && rightAns==1){
            int left=root.left!=null?root.left.data:0;
            int right=root.right!=null?root.right.data:0;
            
            if((left+right)==root.data) return 1;
        }
        return 0;
        
    }
}
