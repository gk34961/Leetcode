class GFG 
{
    //Function to construct the BST from its given level order traversal.
    public Node constructBST(int[] arr)
    {
        //Write your code here 
        int n=arr.length;
        Node root=null;
        
        for(int i=0; i<n; i++){
            root = solve(root, arr[i]);
        }
    return root;
    }
    
    Node solve(Node root, int x){
    if(root == null)
        return new Node(x);
    
    if(root.data > x)
        root.left = solve(root.left, x);
    if(root.data < x)
        root.right = solve(root.right, x);
    return root;
    }
}
