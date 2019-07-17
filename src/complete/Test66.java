package complete;

/**
 * 加一
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/17 19:47
 */
public class Test66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0){
                return digits;
            }
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        Test66 test66 = new Test66();
        int[] ints = test66.plusOne(new int[]{4, 3, 2, 9});
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
