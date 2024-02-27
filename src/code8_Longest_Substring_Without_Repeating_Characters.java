import java.util.HashMap;

/**
 * @Author: hhx
 * @Date: 2024/2/27 10:34
 * @Description: TODO
 * @Version: 1.0
 */
public class code8_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int max=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                left=Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}
