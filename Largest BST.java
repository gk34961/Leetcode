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
