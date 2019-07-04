package complete;

/**
 * 买卖股票的最佳时机
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/4 21:00
 */
public class Test121 {
    public int maxProfit(int[] prices) {
        //最小买入价
        int minPrice = Integer.MAX_VALUE;
        //差价
        int max = 0;
        for (int i = 0; i < prices.length ; i++) {
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }
            else if(prices[i] - minPrice >= max){
                max = prices[i] - minPrice;
            }
        }
        return max;
    }
}
