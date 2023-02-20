class Tree{
    // return the head of the DLL and remove those node from the tree as well.
    public Node convertToDLL(Node root)
    {
        // Code here
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        Node node=null;
        Node current=null;
        
        for(int item:list){
            Node n=new Node(item);
            if(node==null){
                node=n;
                current=n;
            }else{
                current.right=n;
                n.left=current;
                current=n;
            }
        }
        
        return node;
    }
    
    Node inorder(Node root,List<Integer> list){
        if(root==null) return null;
        if(root.left==null && root.right==null){
            list.add(root.data);
            return null;
        }
        root.left=inorder(root.left,list);
        root.right=inorder(root.right,list);
        
        return root;
    }
}

