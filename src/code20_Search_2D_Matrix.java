/**
 * @Author: hhx
 * @Date: 2024/3/18 9:49
 * @Description: TODO
 * @Version: 1.0
 */
public class code20_Search_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=matrix.length-1;i>=0;i--){
            if(matrix[i][0]>target){
                continue;
            }
            int[] arr=new int[matrix[0].length];
            for(int j=0;j<matrix[0].length;j++){
                arr[j]=matrix[i][j];
            }
            if(binarySearch(arr,target)){
                return true;
            }
        }
        return false;
    }
    public boolean binarySearch(int[] arr,int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return true;
            }else if(target<arr[mid]){
                high=mid-1;
            }else if(target>arr[mid]){
                low=mid+1;
            }
        }
        return false;
    }
}
