import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: hhx
 * @Date: 2024/3/12 9:21
 * @Description: TODO
 * @Version: 1.0
 */
public class code17_First_Missing_Positive {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=nums[0];
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            hs.add(nums[i]);
        }
        if(max<=0){
            return 1;
        }
        for(int i=1;i<=max;i++){
            if(!hs.contains(i)){
                return i;
            }
        }
        return max+1;
    }
}
