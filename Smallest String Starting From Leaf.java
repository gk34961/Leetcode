class Solution {
    String result=new String();
    public String smallestFromLeaf(TreeNode root) {
        
        recursion(root,"");
        return result;
    }
    void recursion(TreeNode root,String prevString){
        if(root==null) return;
        prevString=getVal(root.val)+prevString;
        
        if(root.right==null && root.left==null){
            //System.out.println(prevString);
            if(result.isEmpty() || prevString.compareTo(result)<0)
                result=prevString;
            return;
        }
        
            recursion(root.left,prevString);
            recursion(root.right,prevString);
    }
    String getVal(int val){
        return String.valueOf((char)(val+'a'));
    }
}
