package complete;

/**
 * 两数之和 II - 输入有序数组
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/7 10:09
 */
public class Test167 {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length-1;
        int [] result = new int[2];
            while (low < high){
                int sum = numbers[low]+numbers[high];
                if(sum > target){
                    high--;
                }
                else if (sum < target){
                    low++;
                }

                else {
                    result[0] = low+1;
                    result[1] = high+1;
                    return result;
                }
            }
        result[0] = -1;
        result[1] = -1;
        return result;
    }
}
