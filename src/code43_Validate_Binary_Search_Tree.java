/**
 * @Author: hhx
 * @Date: 2024/4/22 10:51
 * @Description: TODO
 * @Version: 1.0
 */
public class code43_Validate_Binary_Search_Tree {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean isValidBST(TreeNode node,long lower,long upper){
        if(node==null) return true;
        if(node.val<=lower||node.val>=upper) return false;
        return isValidBST(node.left,lower,node.val) &&isValidBST(node.right,node.val,upper);
    }
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
}
