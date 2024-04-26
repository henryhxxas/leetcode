import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hhx
 * @Date: 2024/4/25 10:42
 * @Description: TODO
 * @Version: 1.0
 */
public class code46_Flatten_Binary_Tree_to_Linked_List {
    public void flatten(TreeNode root) {
        List<TreeNode> list=new ArrayList<>();
        preorderTraversal(root,list);
        int size=list.size();
        for(int i=1;i<size;i++){
            TreeNode prev=list.get(i-1);
            TreeNode curr=list.get(i);
            prev.left=null;
            prev.right=curr;
        }
    }
    private void preorderTraversal(TreeNode root,List<TreeNode> list){
        if(root!=null){
            list.add(root);
            preorderTraversal(root.left,list);
            preorderTraversal(root.right,list);
        }
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
