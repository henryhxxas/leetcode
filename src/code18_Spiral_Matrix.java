import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hhx
 * @Date: 2024/3/14 10:05
 * @Description: TODO
 * @Version: 1.0
 */
public class code18_Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length,x=0,i=0,j=0;
        int count=n*m;
        List<Integer> list=new ArrayList<>();
        while(count>0){
            for(j=x;j<n;j++){
                list.add(matrix[x][j]);
                count--;
            }
            if(count==0) break;
            for(i=x+1;i<m;i++){
                list.add(matrix[i][j-1]);
                count--;
            }
            if(count==0) break;
            m--;
            n--;
            for(j=n-1;j>=x;j--){
                list.add(matrix[m][j]);
                count--;
            }
            if(count==0) break;
            for(i=m-1;i>=x+1;i--){
                list.add(matrix[i][j+1]);
                count--;
            }
            if(count==0) break;
            x++;
        }
        return list;
    }
}
