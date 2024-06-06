import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: hhx
 * @Date: 2024/6/6 10:40
 * @Description: TODO
 * @Version: 1.0
 */
public class code57_Letter_Combinations_of_a_Phone_Number {
    public List<String> letterCombinations(String digits) {
        List<String> combinations=new ArrayList<String>();
        if(digits.length()==0){
            return combinations;
        }
        Map<Character,String> phoneMap=new HashMap<>(){{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backtrack(combinations,phoneMap,digits,0,new StringBuffer());
        return combinations;
    }
    public void backtrack(List<String> combinations, Map<Character,String> phoneMap, String digits, int index, StringBuffer combination){
        if(index==digits.length()){
            combinations.add(combination.toString());
        }else{
            char digit=digits.charAt(index);
            String letters=phoneMap.get(digit);
            for(int i=0;i<letters.length();i++){
                combination.append(letters.charAt(i));
                backtrack(combinations,phoneMap,digits,index+1,combination);
                combination.deleteCharAt(index);
            }
        }
    }
}
