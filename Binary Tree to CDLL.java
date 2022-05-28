class Solution
{ 
    //Function to convert binary tree into circular doubly linked list.
    Node head=null;
    Node prev=null;
    Node bTreeToClist(Node root)
    {
        //your code here
        Node node=function(root);
        prev.right=head;
        head.left=prev;
        return node;
    }
    Node function(Node root){
        //your code here
        if(root==null) return root;
        function(root.left);
        if(head==null){
            head=root;
            prev=root;
        }else{
            prev.right=root;
            root.left=prev;
            prev=root;
        }
        function(root.right);
        return head;
    }
}
