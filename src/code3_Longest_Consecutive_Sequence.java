import java.util.Arrays;

/**
 * @Author: hhx
 * @Date: 2024/2/21 16:57
 * @Description: TODO
 * @Version: 1.0
 */
public class code3_Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int num=1;
        int max=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]){
                continue;
            }
            if(nums[i+1]==nums[i]+1){
                num++;
                if(max<num){
                    max=num;
                }
            }else{
                num=1;
            }
        }
        return max;
    }
}
