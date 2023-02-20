class Solution
{
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here 
        return helper(inorder,preorder,0,n-1,0,n-1);
    }
    static Node helper(int in[], int post[], int instart,int inend,int postart,int poend){
        if(instart>inend) return null;
        
        int rootval=post[postart];
        Node node=new Node(rootval);
        if(instart==inend) return node;
        
        int rootIndex=instart;
        for(;rootIndex<=inend;rootIndex++){
            if(in[rootIndex]==rootval) break;
        }
        
        int leftsize=rootIndex-instart;
        int rightsize=inend-rootIndex;
        
        node.left=helper(in,post,instart,rootIndex-1,postart+1,postart+leftsize);
        node.right=helper(in,post,rootIndex+1,inend,poend-rightsize+1,poend);
        
        return node;
    }
}
