import java.util.HashMap;

/**
 * @Author: hhx
 * @Date: 2024/4/26 9:36
 * @Description: TODO
 * @Version: 1.0
 */
public class code47_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    int[] preorder;
    HashMap<Integer,Integer> dic=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder=preorder;
        for(int i=0;i<inorder.length;i++){
            dic.put(inorder[i],i);
        }
        return recur(0,0,inorder.length-1);
    }
    private TreeNode recur(int root,int left,int right){
        if(left>right) return null; //递归终止
        TreeNode node=new TreeNode(preorder[root]);//建立根节点
        int i=dic.get(preorder[root]);//划分根节点、左子树、右子树
        node.left=recur(root+1,left,i-1);//开启左子树递归
        node.right=recur(root+i-left+1,i+1,right);//开启右子树递归
        return node;//回溯返回根节点
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
