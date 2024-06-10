import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: hhx
 * @Date: 2024/6/10 12:57
 * @Description: TODO
 * @Version: 1.0
 */
public class code61_Palindrome_Partitioning {
    boolean[][] f;
    List<List<String>> ret=new ArrayList<>();
    List<String> ans=new ArrayList<>();
    int n;
    public List<List<String>> partition(String s) {
        n=s.length();
        f=new boolean[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(f[i],true);
        }
        for(int i=n-1;i>=0;i--){
            for(int j=i+1;j<n;j++){
                f[i][j]=(s.charAt(i)==s.charAt(j))&&f[i+1][j-1];
            }
        }
        dfs(s,0);
        return ret;
    }
    public void dfs(String s,int i){
        if(i==n){
            ret.add(new ArrayList<>(ans));
            return ;
        }
        for(int j=i;j<n;j++){
            if(f[i][j]){
                ans.add(s.substring(i,j+1));
                dfs(s,j+1);
                ans.remove(ans.size()-1);
            }
        }
    }
}
