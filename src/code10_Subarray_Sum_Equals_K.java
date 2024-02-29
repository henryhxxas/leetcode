import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hhx
 * @Date: 2024/2/29 10:52
 * @Description: TODO
 * @Version: 1.0
 */
public class code10_Subarray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int pre=0,count=0;
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++){
            pre+=nums[i];
            if(hm.containsKey(pre-k)){
                count+=hm.get(pre-k);
            }
            hm.put(pre,hm.getOrDefault(pre,0)+1);
        }
        return count;
    }
}
