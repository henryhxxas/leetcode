import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: hhx
 * @Date: 2024/4/18 10:08
 * @Description: TODO
 * @Version: 1.0
 */
public class code41_Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> deque=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        if(root!=null) deque.offer(root);
        while(!deque.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            for(int i=deque.size();i>0;i--){
                TreeNode node=deque.poll();
                temp.add(node.val);
                if(node.left!=null) deque.offer(node.left);
                if(node.right!=null) deque.offer(node.right);
            }
            list.add(temp);
        }
        return list;
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int x) { val = x; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
