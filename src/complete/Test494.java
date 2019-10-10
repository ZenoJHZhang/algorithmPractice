package complete;

/**
 * 目标和
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/10/9 19:32
 */
public class Test494 {
    // sum（x） 为 加的集合 ，sum（y）为减的集合
    // sum(x) + sum(y) + sum(x) - sum(y) = sum(N) + target
    // => 2sum(x) = sum(N) + target
    // 所以找一个子集 sum（x）= （sum（N）+ target）/2
    //[1,1,1,1,1]
    //S = 3
    // sum = 5
    // sum(x) = 4
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum < S || (sum + S) % 2 == 1) {
            return 0;
        }
        S = (S + sum) / 2;
        int[] dp = new int[S + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = S; i >= num; i--) {
                dp[i] += dp[i - num];

            }
        }
        return dp[S];
    }
}
