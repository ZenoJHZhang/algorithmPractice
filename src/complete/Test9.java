package complete;

/**
 * 回文数
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/6/26 20:55
 */
public class Test9 {
    /**
     * 思路
     * 先将之前的最小位数值乘以10（相当于变高一位）
     * 再加上现在的数 mod 10 的余数（相当于现在的最小位数值）
     * 即可得出当前总位数下的数
     *
     * 再将当前数除以10，便可再将原先的数低一位
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        //记录上一位
        int m = 0;
        int n = x;
        while (n >= 1) {
            m = m * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(m);
        return m == x;
    }


    public static void main(String[] args) {
        Test9 test9 = new Test9();
        System.out.println(test9.isPalindrome(1));
    }
}
