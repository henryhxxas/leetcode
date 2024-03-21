/**
 * @Author: hhx
 * @Date: 2024/3/15 10:26
 * @Description: TODO
 * @Version: 1.0
 */
public class code20_Rotate_Image {
    //先对角线互换位置，再竖着对半翻转
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int j=0;j<m/2;j++){
            for(int i=0;i<n;i++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][m-1-j];
                matrix[i][m-1-j]=temp;
            }
        }
    }
}
