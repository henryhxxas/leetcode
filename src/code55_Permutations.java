import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hhx
 * @Date: 2024/6/4 11:07
 * @Description: TODO
 * @Version: 1.0
 */
public class code55_Permutations {
    List<Integer> nums;
    List<List<Integer>> res;
    private void swap(int a,int b){
        int tmp=nums.get(a);
        nums.set(a,nums.get(b));
        nums.set(b,tmp);
    }
    private void dfs(int x){
        if(x==nums.size()-1){
            res.add(new ArrayList<>(nums));//添加排列方案
            return;
        }
        for(int i=x;i<nums.size();i++){
            swap(i,x);//交换，将num[i]固定在第x位
            dfs(x+1); //开启固定第x+1位元素
            swap(i,x);//恢复交换
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        this.res=new ArrayList<>();
        this.nums=new ArrayList<>();
        for(int num:nums){
            this.nums.add(num);
        }
        dfs(0);
        return res;
    }
}
