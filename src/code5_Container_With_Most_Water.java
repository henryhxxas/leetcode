/**
 * @Author: hhx
 * @Date: 2024/2/23 15:39
 * @Description: TODO
 * @Version: 1.0
 */
public class code5_Container_With_Most_Water {
    public int maxArea(int[] height) {
        int max=0;
        for(int i=0,j=height.length-1;i<j;){
            int volumn=(j-i)*Math.min(height[i],height[j]);
            if(max<volumn){
                max=volumn;
            }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
