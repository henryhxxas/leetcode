import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hhx
 * @Date: 2024/4/10 9:19
 * @Description: TODO
 * @Version: 1.0
 */
public class code36_Binary_Tree_Inorder_Traversal {
    private List<Integer> listnode=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root!=null){
            listnode=inorderTraversal(root.left);
            listnode.add(root.val);
            listnode=inorderTraversal(root.right);
        }
        return listnode;
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
