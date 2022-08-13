class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int count =1;
        
        while(!q.isEmpty()){
            int siz=q.size();
            while(siz>0){
                TreeNode temp=q.poll();
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                
            siz--;
            }  
            count++;
        }
        
        int deavesSum=0;
        q.add(root);
        int len =1;
        while(!q.isEmpty()){
            int siz=q.size();
            while(siz>0){
                
                TreeNode temp=q.poll();
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                if(len==(count-1)) deavesSum+=temp.val;
                
            siz--;
            } 
            len++;
        }
        
       return  deavesSum;
    }
}

==========================================================================================================================
    class Solution {
    int sum=0;
    int maxLevel=0;
    public int deepestLeavesSum(TreeNode root) {
        if(root==null) return 0;
        function(root,0);
        return sum;
    }
    void function(TreeNode root,int level){
        if(root==null) return;
        
        if(level>maxLevel){sum=0; maxLevel=level;}
        if(level == maxLevel){
            sum = sum + root.val;
        }
        function(root.left,level+1);
        function(root.right,level+1);
    }
}

