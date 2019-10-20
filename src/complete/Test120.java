package complete;

import java.util.LinkedList;
import java.util.List;

/**
 * 三角形最小路径和
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/10/20 10:23
 */
public class Test120 {
    /**
     * 动态规划
     * i，j表示位置
     * dp[i][j]表示从上到下到i，j位置的路径和
     * dp[i][j] = Min(dp[i-1],[j],dp[i][j-1])+t[i][j]
     * 每行最后一个和第一个需特殊处理
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        int length = triangle.size();
        int [][] dp = new int[length][length];
        for (int i = 0; i < length; i++) {
            List<Integer> list = triangle.get(i);
            if (i == 0){
                dp[0][0] = list.get(0);
            }
            else {
                for (int j = 0; j < list.size(); j++) {
                    if (i == j){
                        dp[i][j] = dp[i-1][j-1]+ list.get(j);
                    }
                    else if(j == 0){
                        dp[i][j] = dp[i-1][j] + list.get(j);
                    }
                    else {
                        dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j-1])+ list.get(j);
                    }
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            int n = dp[length - 1][i];
            if (n < min){
                min = n;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        List<Integer> list1  = new LinkedList<>();
        list1.add(2);
        List<Integer> list2  = new LinkedList<>();
        list2.add(3);
        list2.add(4);
        List<Integer> list3  = new LinkedList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        List<Integer> list4  = new LinkedList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        List<List<Integer>> triangle = new LinkedList<>();
        triangle.add(list1);
        triangle.add(list2);
        triangle.add(list3);
        triangle.add(list4);
        Test120 test120 = new Test120();
        System.out.println(test120.minimumTotal(triangle));
    }
}
