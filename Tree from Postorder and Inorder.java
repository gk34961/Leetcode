class GfG
{
    //Function to return a tree created from postorder and inoreder traversals.
    Node buildTree(int in[], int post[], int n) {
        // Your code here
        return helper(in,post,0,n-1,0,n-1);
    }
    Node helper(int in[], int post[], int instart,int inend,int postart,int poend){
        if(instart>inend) return null;
        
        int rootval=post[poend];
        Node node=new Node(rootval);
        
        int rootIndex=instart;
        for(;rootIndex<=inend;rootIndex++){
            if(in[rootIndex]==rootval) break;
        }
        
        int leftsize=rootIndex-instart;
        int rightsize=inend-rootIndex;
        
        node.left=helper(in,post,instart,rootIndex-1,postart,postart+leftsize-1);
        node.right=helper(in,post,rootIndex+1,inend,poend-rightsize,poend-1);
        
        return node;
    }
}
