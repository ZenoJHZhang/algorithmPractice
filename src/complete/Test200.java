package complete;

/**
 * 岛屿数量
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/10/10 20:00
 */
public class Test200 {
    /**
     * 沉没法
     * 深度遍历把连着的1全部变0
     * 统计沉没后后1的数量即为岛的数量
     * @param grid
     * @return
     */
    public int numIslands(char[][] grid) {

        int num = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1'){
                    num ++;
                }
                dfs(grid,i,j);
            }
        }
        return num;

    }

    private void dfs(char[][] grid,int r,int c){
        int rn = grid.length;
        int cn = grid[0].length;
        //已经沉没的岛也要返回 ，length比实际大1
        if (r < 0 || c < 0 || r >= rn || c >= cn || grid[r][c] == '0'){
            return;
        }
        grid[r][c] = '0';
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
}
