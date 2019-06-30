package complete;

/**
 * 删除排序数组中的重复项
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/6/30 10:14
 */
public class Test26 {
    //一个快指针循环数组
    //一个慢指针代表当前不重复项位置
    public int removeDuplicates(int[] nums) {
        int count = 0;
        if (nums.length == 0){
            return 0;
        }
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != nums[count]){
                count++;
                nums[count] = nums[i];
            }
        }
        return ++count;
    }

    public static void main(String[] args) {
        Test26 test26 = new Test26();
        int [] nums = new int[]{1,2,2,3,4,5};
        System.out.println(test26.removeDuplicates(nums));
    }
}
