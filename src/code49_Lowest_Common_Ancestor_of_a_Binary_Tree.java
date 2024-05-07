/**
 * @Author: hhx
 * @Date: 2024/5/7 17:07
 * @Description: TODO
 * @Version: 1.0
 */
public class code49_Lowest_Common_Ancestor_of_a_Binary_Tree {
    private TreeNode ans=null;
    private boolean dfs(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) return false;
        boolean lson=dfs(root.left,p,q);
        boolean rson=dfs(root.right,p,q);
        if((lson&&rson)||((root.val==p.val||root.val==q.val)&&(lson||rson))){
            ans=root;
        }
        return lson||rson||(root.val==p.val||root.val==q.val);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root,p,q);
        return ans;
    }
    private class TreeNode{
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
