import java.util.*;

/**
 * @Author: hhx
 * @Date: 2024/2/20 15:08
 * @Description: TODO
 * @Version: 1.0
 */
public class code2_Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str:strs){
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            //System.out.println(new String(chars));
            String key=new String(chars);
            List<String> list=map.getOrDefault(key,new ArrayList<String>());
            list.add(str);
            map.put(key,list);

        }
        return new ArrayList<List<String>>(map.values());
    }

    public static void main(String[] args) {
        code2_Group_Anagrams groupAnagrams=new code2_Group_Anagrams();
        groupAnagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }
}
