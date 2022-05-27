class Tree 
{
    //Function to serialize a tree and return a list containing nodes of tree.
	public void serialize(Node root, ArrayList<Integer> A) {
	    if(root==null){
	        A.add(-1);
	        return ;
	    }
	    A.add(root.data);
	    serialize(root.left,A);
	    serialize(root.right,A);
	}
	
	//Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A)
    {
        if(A.get(0)==-1){
            A.remove(0);
            return null;
        }
        Node root = new Node(A.remove(0));
        root.left = deSerialize(A);
        root.right = deSerialize(A);
        return root;
    }
}
