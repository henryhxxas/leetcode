import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: hhx
 * @Date: 2024/4/23 12:53
 * @Description: TODO
 * @Version: 1.0
 */
public class code44_Kth_Smallest_Element_in_a_BST {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack=new ArrayDeque<TreeNode>();
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            k--;
            if(k==0) break;
            root=root.right;
        }
        return root.val;
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
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
}
