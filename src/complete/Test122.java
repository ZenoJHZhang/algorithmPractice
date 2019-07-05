package complete;

/**
 * 买卖股票的最佳时机 II
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/5 20:14
 */
public class Test122 {
    //有图可知，总利润等于所有涨的区段之和
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i-1] > 0){
                max += prices[i] - prices[i-1];
            }
        }
        return max;
    }
}
