package complete;

/**
 * 最大连续1的个数
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/15 19:51
 */
public class Test485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                t ++;
            }
            if (t > max){
                max = t;
            }
            if (nums[i] == 0){
                t = 0;
            }
        }
        return max;
    }

}
