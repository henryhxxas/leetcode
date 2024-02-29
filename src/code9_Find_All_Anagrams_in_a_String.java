import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: hhx
 * @Date: 2024/2/29 10:50
 * @Description: TODO
 * @Version: 1.0
 */
public class code9_Find_All_Anagrams_in_a_String {
    public List<Integer> findAnagrams(String s, String p) {
        int sn=s.length();
        int pn=p.length();
        List<Integer> list=new ArrayList<>();
        if(sn<pn){
            return list;
        }
        int[] pnt=new int[26];
        for(int i=0;i<pn;i++){
            pnt[p.charAt(i)-'a']++;
        }
        int[] snt=new int[26];
        for(int i=0;i<pn;i++){
            snt[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(snt,pnt)){
            list.add(0);
        }
        for(int i=0,j=pn-1;j<sn-1;i++,j++){
            snt[s.charAt(i)-'a']--;
            snt[s.charAt(j+1)-'a']++;
            if(Arrays.equals(snt,pnt)){
                list.add(i+1);
            }
        }
        return list;
    }
}
