package complete;

/**
 * 乘积小于K的子数组
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/1/9 20:07
 */
public class Test713 {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            if (k <= 1) return 0;
            int prod = 1, ans = 0, left = 0;
            for (int right = 0; right < nums.length; right++) {
                prod *= nums[right];
                while (prod >= k) prod /= nums[left++];
                ans += right - left + 1;
            }
            return ans;
        }


    public static void main(String[] args) {
        Test713 test713 = new Test713();
        int [] nums = new int[]{10,5,2,6};
        int k = 100;
        System.out.println(test713.numSubarrayProductLessThanK(nums, k));
    }
}
