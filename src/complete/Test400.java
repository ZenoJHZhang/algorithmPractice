package complete;

/**
 * 第N个数字
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/10/17 15:41
 */
public class Test400 {
    public int findNthDigit(int n) {
        if (n <= 9) {
            return n;
        }
        int t;
        double v = 0;
        double before = 0;
        for (int i = 1; ; i++) {
            before = v;
            v += (Math.pow(10, i) - Math.pow(10, i - 1)) * i;
            if (n <= v) {
                t = i;
                break;
            }
        }


        //第几个数
        int m = ((int) (n - before) / t) + 1;


        //第几个数的第几个
        int g = ((int) (n - before) % t);

        if (g == 0) {
            m = m - 1;
            g = g + t;
        }

        int totalM = m + (int) Math.pow(10, t - 1) - 1;

        return Integer.valueOf(String.valueOf(String.valueOf(totalM).charAt(g - 1)));
    }

    public static void main(String[] args) {
        Test400 test400 = new Test400();
        System.out.println(test400.findNthDigit(10000));
    }
}
