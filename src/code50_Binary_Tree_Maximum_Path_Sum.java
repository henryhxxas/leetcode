/**
 * @Author: hhx
 * @Date: 2024/5/30 10:27
 * @Description: TODO
 * @Version: 1.0
 */
public class code50_Binary_Tree_Maximum_Path_Sum {
    int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }
    public int maxGain(TreeNode node){
        if(node==null){
            return 0;
        }
        //递归计算左右子节点的最大贡献值
        //只有在最大贡献值大于0时，才会选取对应子节点
        int leftGain=Math.max(maxGain(node.left),0);
        int rightGain=Math.max(maxGain(node.right),0);
        //节点的最大路径和取决于该节点的值与该节点的左右子节点的最大贡献值
        int priceNewpath=node.val+leftGain+rightGain;
        //跟新答案
        maxSum=Math.max(maxSum,priceNewpath);
        //返回节点的最大贡献值
        return node.val+Math.max(leftGain,rightGain);
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
