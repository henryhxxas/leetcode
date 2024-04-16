/**
 * @Author: hhx
 * @Date: 2024/4/16 10:31
 * @Description: TODO
 * @Version: 1.0
 */
public class code39_Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        //调用递归函数，比较左节点、右节点
        return dfs(root.left,root.right);
    }
    private boolean dfs(TreeNode left,TreeNode right){
        //递归的终止条件是两个节点为空，或者两个节点其中一个为空，或者两个节点的值不相等
        if(left==null&&right==null){
            return true;
        }
        if(left==null||right==null){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        //再递归比较左节点的左孩子和右节点的右孩子以及左节点的右孩子和右节点的左孩子
        return dfs(left.left,right.right)&&dfs(left.right,right.left);
    }
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){

        }
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
}
