package tommory;

/**
 * 最大连续1的个数 III
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/15 19:57
 */
public class Test1004 {
    public int longestOnes(int[] A, int K) {
        int count = 0;
        int left = 0;
        int res = 0;
        for (int r = 0; r < A.length; r++) {
            if (A[r] == 1) {
                count++;
            }
            while (r - left + 1 - count > K) {
                if (A[left] == 1) {
                    count--;
                }
                left++;
            }
            res = Math.max(res, r - left + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Test1004 test1004 = new Test1004();
        System.out.println(test1004.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
    }
}
