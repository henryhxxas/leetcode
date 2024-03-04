import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: hhx
 * @Date: 2024/3/4 10:24
 * @Description: TODO
 * @Version: 1.0
 */
public class code11_Sliding_Window_Maximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0||k==0){
            return new int[0];
        }
        Deque<Integer> deque=new LinkedList<>();
        int[] res=new int[nums.length-k+1];
        //未形成窗口
        for(int i=0;i<k;i++){
            while(!deque.isEmpty()&&deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        res[0]=deque.peekFirst();

        //形成窗口
        for(int i=k;i<nums.length;i++){
            if(deque.peekFirst()==nums[i-k]){
                deque.removeFirst();
            }
            while(!deque.isEmpty()&&deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            res[i-k+1]=deque.peekFirst();
        }
        return res;
    }
}
