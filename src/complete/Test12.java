package complete;

/**
 * 整数转罗马数字
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/6/25 20:19
 */
public class Test12 {
    //思路
    //列出所有可能性，从大到小选取即可
    //借助题解
    public String intToRoman(int num) {
        int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                s.append(strs[i]);
                num = num - values[i];
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Test12 test12 = new Test12();
        System.out.println(test12.intToRoman(99));
    }
}
