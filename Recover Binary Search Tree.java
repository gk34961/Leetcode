class Solution {
    TreeNode first=null;
    TreeNode second=null;
    TreeNode prev=null;
    
    public void recoverTree(TreeNode root) {
        recursion(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    void recursion(TreeNode root){
        if(root==null) return;
        
        recursion(root.left);
        if (prev != null && prev.val > root.val) {
            if (first == null)
                first = prev;
            second = root;
        }
        prev = root;
        recursion(root.right);
        
    }
}
