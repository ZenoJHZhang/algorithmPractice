package complete;

/**
 * 求众数
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/8 19:53
 */
public class Test169 {

    // 碰到一样的数count++，不一样count——；
    //下一次count为0时的数为新的可能众数
    //最后返回剩余的那个数即为真正众数
    public int majorityElement(int[] nums) {
        int count = 0;
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                result = nums[i];
            }

            if (result == nums[i]) {
                count++;
            } else {
                count--;
            }


        }
        return result;
    }

    public static void main(String[] args) {
        Test169 test169 = new Test169();
        System.out.println(test169.majorityElement(new int[]{3, 3, 4}));
    }
}
