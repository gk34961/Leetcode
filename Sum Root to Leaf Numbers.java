class Solution {
    int sum=0;
    public int sumNumbers(TreeNode root) {
        function(root,0);
        return sum;
    }
    void function(TreeNode node,int total){
        if(node==null) return;
        
        total=total*10+node.val;
        if(node.left==null && node.right==null){
            sum+=total;
            return;
        }
        function(node.left,total);
        function(node.right,total);     
    }
}
