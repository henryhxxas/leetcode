import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hhx
 * @Date: 2024/5/31 10:57
 * @Description: TODO
 * @Version: 1.0
 */
public class code52_Rotting_Oranges {
    private static final int[][] DIRECTIONS={{-1,0},{1,0},{0,-1},{0,1}};//四方向
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int fresh=0;
        List<int[]> q=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    fresh++;//统计新鲜橘子个数
                }else if(grid[i][j]==2){
                    q.add(new int[]{i,j});//一开始就腐烂的橘子
                }
            }
        }
        int ans=-1;
        while(!q.isEmpty()){
            ans++;//经过一分钟
            List<int[]> tmp=q;
            q=new ArrayList<>();
            for(int[] pos:tmp){//已经腐烂的橘子
                for(int[] d:DIRECTIONS){ //四方向
                    int i=pos[0]+d[0];
                    int j=pos[1]+d[1];
                    if(i>=0&&i<m&&j>=0&&j<n&&grid[i][j]==1){ //新鲜橘子
                        fresh--;
                        grid[i][j]=2;//变成腐烂橘子
                        q.add(new int[]{i,j});
                    }
                }
            }
        }
        return fresh>0?-1:Math.max(ans,0);
    }
}
