import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: hhx
 * @Date: 2024/3/21 10:01
 * @Description: TODO
 * @Version: 1.0
 */
public class code18_Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {
        Map<int[],Integer> hm=new HashMap<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    int[] array={i,j};
                    hm.put(array,matrix[i][j]);
                }
            }
        }
        Set<Map.Entry<int[],Integer>> entrySet=hm.entrySet();
        for(Map.Entry<int[], Integer> me : entrySet){
            int[] value=me.getKey();
            for(int j=0;j<matrix[0].length;j++){
                matrix[value[0]][j]=0;
            }
            for(int i=0;i<matrix.length;i++){
                matrix[i][value[1]]=0;
            }
        }
    }
}
