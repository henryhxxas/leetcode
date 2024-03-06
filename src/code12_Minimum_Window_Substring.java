import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hhx
 * @Date: 2024/3/6 9:35
 * @Description: TODO
 * @Version: 1.0
 */
public class code12_Minimum_Window_Substring {
    public String minWindow(String s, String t) {
        Map<Character,Integer> need=new HashMap<>();
        Map<Character,Integer> window=new HashMap<>();
        for(int i=0;i<t.length();i++){
            need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
        }
        int right=0,left=0;
        int valid=0;
        int start=0,minLen=Integer.MAX_VALUE;
        while(right<s.length()){
            char cur=s.charAt(right);
            right++;
            //进行窗口数据一系列更新
            if(need.containsKey(cur)){
                Integer total=window.getOrDefault(cur,0);
                window.put(cur,total+1);
                if(window.get(cur).equals(need.get(cur))){
                    valid++;
                }
            }
            while(need.size()==valid){
                if(right-left<minLen){
                    start=left;
                    minLen=right-left;
                }
                //d是将移除窗口的字符串
                char d=s.charAt(left);
                //左边移动窗口
                left++;
                //进行窗口内数据当一系列更新
                if(window.containsKey(d)){
                    if(window.get(d).equals(need.get(d))){
                        valid--;
                    }
                    window.put(d,window.get(d)-1);
                }
            }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}
