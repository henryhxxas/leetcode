/**
 * @Author: hhx
 * @Date: 2024/4/20 14:58
 * @Description: TODO
 * @Version: 1.0
 */
public class code42_Convert_Sorted_Array_to_Binary_Search_Tree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    public TreeNode helper(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        //总是选择中间位置左边的数字作为根节点
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=helper(nums,left,mid-1);
        root.right=helper(nums,mid+1,right);
        return root;
    }
    public static class TreeNode {
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
