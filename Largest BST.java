class Tree{
        boolean b;
        int size;
        int min;
        int max;
        
        Tree(boolean b,int size,int min,int max){
            this.b=b;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }


class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        // Write your code here
       Tree temp= function(root);
        return temp.size;
    }
   static Tree function(Node root){
        if(root==null) return new Tree(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        
        Tree left=function(root.left);
        Tree right=function(root.right);
        
        if(left.b==true && right.b==true && left.max<root.data && right.min>root.data) 
            return new Tree(true,1+left.size+right.size,Math.min(root.data,left.min),Math.max(root.data,right.max));
        else 
            return new Tree(false,Math.max(left.size,right.size),-1,-1);
    }
}

=======================================================================================================================================================================
class Solution{
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        // Write your code here
        if(root==null) return 0;
        if(isBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
        return size(root);
        return Math.max(largestBst(root.left),largestBst(root.right));
    }
    static int size(Node node){
        if(node==null) return 0;
        return 1+size(node.left)+size(node.right);
    }
    static boolean isBst(Node root,int min,int max){
        if(root==null) return true;
        if(root.data<min||root.data>max) return false;
        return isBst(root.left,min,root.data-1) && isBst(root.right,root.data+1,max);
    }
}
