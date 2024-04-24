import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: hhx
 * @Date: 2024/4/24 10:29
 * @Description: TODO
 * @Version: 1.0
 */
public class code50_Binary_Tree_Right_Side_View {
    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> deque=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        if(root!=null) deque.offer(root);
        while(!deque.isEmpty()){
            for(int i=deque.size();i>0;i--){
                TreeNode node=deque.poll();
                if(i==1){
                    list.add(node.val);
                }
                if(node.left!=null) deque.offer(node.left);
                if(node.right!=null) deque.offer(node.right);
            }
        }
        return list;
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
