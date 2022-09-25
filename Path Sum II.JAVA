/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        
        recursion(root,list,result,targetSum);
        return result;
    }
    
   void recursion(TreeNode root,List<Integer> list,List<List<Integer>> result,int targetSum){
        if(root==null) return;
       
        list.add(root.val);
        if(root.left==null && root.right==null && targetSum-root.val==0)
            result.add(new ArrayList<>(list));
       
        if(root.left!=null) recursion(root.left,list,result,targetSum-root.val);
        if(root.right!=null) recursion(root.right,list,result,targetSum-root.val);
        
        list.remove(list.size()-1);
        
    }
}
