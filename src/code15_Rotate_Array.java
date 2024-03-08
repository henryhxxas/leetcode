/**
 * @Author: hhx
 * @Date: 2024/3/8 9:38
 * @Description: TODO
 * @Version: 1.0
 */
public class code15_Rotate_Array {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start+=1;
            end-=1;
        }
    }
}
