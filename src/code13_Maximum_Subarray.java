/**
 * @Author: hhx
 * @Date: 2024/3/6 9:36
 * @Description: TODO
 * @Version: 1.0
 */
public class code13_Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int max=nums[0],n=nums.length;
        int[] arr=new int[n];
        if(n==1){
            return nums[0];
        }
        arr[0]=nums[0];
        for(int i=1;i<n;i++){
            arr[i]=Math.max(arr[i-1]+nums[i],nums[i]);
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
