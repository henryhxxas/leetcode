/**
 * @Author: hhx
 * @Date: 2024/5/6 10:34
 * @Description: TODO
 * @Version: 1.0
 */
public class code48_Path_Sum_III {
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        int ret=rootSum(root,targetSum);
        ret+=pathSum(root.left,targetSum);
        ret+=pathSum(root.right,targetSum);
        return ret;
    }
    private int rootSum(TreeNode root,long targetSum){
        int ret=0;
        if(root==null) return 0;
        int val=root.val;
        if(val==targetSum) ret++;
        ret+=rootSum(root.left,targetSum-val);
        ret+=rootSum(root.right,targetSum-val);
        return ret;
    }
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
