import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hhx
 * @Date: 2024/6/5 10:13
 * @Description: TODO
 * @Version: 1.0
 */
public class code56_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> subset = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(subset);
        backtrack(nums,0,subset,res);
        return res;
    }
    public static void backtrack(int[] nums,int i,List<Integer> sub,List<List<Integer>> res){
        for(int j=i;j<nums.length;j++){
            if(j>i&&nums[j]==nums[j-1]) continue;
            sub.add(nums[j]);
            res.add(new ArrayList<Integer>(sub));
            backtrack(nums,j+1,sub,res);
            sub.remove(sub.size()-1);
        }
    }
}
