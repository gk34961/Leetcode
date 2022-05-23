class Tree {
    // Function to delete a node from BST.
    public static Node deleteNode(Node root, int x) {
        // code here.
        if(root==null) return null;
        if(root.data<x ) root.right= deleteNode(root.right,x);
        else if(root.data>x ) root.left= deleteNode(root.left,x);
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                int a = inOrSucc(root);
                root.data = a;
                root.right = deleteNode(root.right, a);
            }
        }
        return root;
    }
    
    private static int inOrSucc(Node root){
        root = root.right;
        while(root != null && root.left != null){
            root = root.left;
        }
        
        return root.data;
    }
}
