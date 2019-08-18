package complete;

/**
 * 不同路径
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/8/15 18:02
 */
public class Test62 {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }

        int[][] d = new int[m][n];
        d[0][1] = 1;
        d[1][0] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                d[0][j] = 1;
                d[i][0] = 1;
                d[i][j] = d[i - 1][j] + d[i][j - 1];
            }
        }
        return d[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Test62 test62 = new Test62();
        System.out.println(test62.uniquePaths(7, 3));
    }
}
