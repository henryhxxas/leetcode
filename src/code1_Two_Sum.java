import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hhx
 * @Date: 2024/2/1 15:18
 * @Description: TODO
 * @Version: 1.0
 */
public class code1_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] arr=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int y=target-nums[i];
            if(map.containsKey(y)&&map.get(y)!=i){
                arr[0]=i;
                arr[1]=map.get(y);
            }
        }
        return arr;
    }
}
//runtime:5 ms
//memory:43.7 MB