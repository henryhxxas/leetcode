/**
 * @Author: hhx
 * @Date: 2024/4/17 10:44
 * @Description: TODO
 * @Version: 1.0
 */
public class code40_Diameter_of_Binary_Tree {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans=1;
        depth(root);
        return ans-1;

    }
    public int depth(TreeNode node){
        if(node==null) return 0;//访问到空节点，返回0
        int L=depth(node.left);//左儿子为根的子树的深度
        int R=depth(node.right);//右儿子为根的子树的深度
        ans=Math.max(ans,L+R+1);//计算d_node即L+R+1 并更新ans
        return Math.max(L,R)+1;//返回该节点为根的子树的深度
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int x) { val = x; }
        TreeNode(int x, TreeNode left, TreeNode right) {
            val = x;
            this.left = left;
            this.right = right;
        }
    }
}
