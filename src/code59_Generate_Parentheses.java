import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hhx
 * @Date: 2024/6/8 15:41
 * @Description: TODO
 * @Version: 1.0
 */
public class code59_Generate_Parentheses {
    private int n;
    private char[] path;
    private final List<String> ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        this.n=n;
        path=new char[n*2];
        dfs(0,0);
        return ans;
    }
    private void dfs(int i,int open){
        if(i==n*2){
            ans.add(new String(path));
            return ;
        }
        if(open<n){//可以填左括号
            path[i]='(';
            dfs(i+1,open+1);
        }
        if(i-open<open){ //可以填右括号
            path[i]=')';
            dfs(i+1,open);
        }
    }
}
