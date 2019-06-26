package easy;

/**
 * 整数反转
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/6/22 12:28
 */
public class Test7 {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        boolean flag = false;
        String s = String.valueOf(x);
        if (s.contains("-")) {
            flag = true;
            s = s.replace("-", "");
        }
        String reverse = new StringBuilder(s).reverse().toString();
        Long l = Long.valueOf(reverse);
        if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
            return 0;
        } else {
            if (flag) {
                reverse = "-" + reverse;
            }
            return Integer.valueOf(reverse);
        }
    }

    public static void main(String[] args) {
        Test7 test7 = new Test7();
        System.out.println(test7.reverse(-22));
    }
}
