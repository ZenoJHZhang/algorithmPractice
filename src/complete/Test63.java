package complete;

/**
 * 不同路径 II
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/1/17 19:33
 */
public class Test63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1){
            return 0;
        }
        obstacleGrid[0][0] = 1;
        int m = obstacleGrid[0].length;
        int n = obstacleGrid.length;
        for (int i = 1; i < m; i++) {
            obstacleGrid[0][i] = (obstacleGrid[0][i-1] == 1 && obstacleGrid[0][i] == 0 )? 1 : 0;
        }
        for (int j = 1; j < n; j++) {
            obstacleGrid[j][0] = (obstacleGrid[j-1][0] == 1 && obstacleGrid[j][0] == 0 )? 1 : 0;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <  m ; j++) {
                if (obstacleGrid[i][j] == 1){
                    obstacleGrid[i][j] = 0;
                }
                else {
                    obstacleGrid[i][j] = obstacleGrid[i -1][j] +  obstacleGrid[i ][j -1];
                }
            }
        }

        return obstacleGrid[n-1][m-1];
    }
}
