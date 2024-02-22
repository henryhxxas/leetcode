/**
 * @Author: hhx
 * @Date: 2024/2/22 20:07
 * @Description: TODO
 * @Version: 1.0
 */
public class code4_Move_Zeroes {
        public void moveZeroes(int[] nums) {
            int n=nums.length;
            if(n==1||n==0){
                return;
            }
            for(int i=0,j=1;j<n;){
                if(nums[i]==0&&nums[j]!=0){
                    nums[i]=nums[j];
                    nums[j]=0;
                    i++;j++;
                }else if(nums[i]==0&&nums[j]==0){
                    j++;
                }else{
                    i++;j++;
                }
            }
        }
}
