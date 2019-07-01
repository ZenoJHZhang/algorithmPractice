package complete;

/**
 * 移除元素
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/1 19:45
 */
public class Test27 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Test27 test27 = new Test27();
        System.out.println(test27.removeElement(new int[]{3, 3, 5, 6}, 3));
    }
}
