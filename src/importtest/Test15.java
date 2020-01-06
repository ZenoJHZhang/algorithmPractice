package importtest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 三数之和
 * 指针和转换的思想
 * 注意点是去重和跳过
 * @author 张江浩
 * @version 1.00
 * @date 2020/1/6 19:55
 */
public class Test15 {
    //转化为 a+b = -c;
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new LinkedList<>();

        //1.排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            //2.如果该值大于0，结束循环
            if (nums[i] > 0) {
                break;
            }
            int L = i + 1;
            int R = nums.length - 1;
            if (L == R) {
                break;
            }
            //这个数和前一个相同，直接跳过
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            //3. 当 L < R
            // 寻找等于0的集合，n[L] + n [R] = - n[i]
            //大了 R -- ,小了 L++
            while (L < R) {
                int sum = nums[L] + nums[R] + nums[i];
                if (sum == 0) {
                    //4.去重 如果L = L + 1，说明下个值重复，直接L++，跳过重复值
                    //R 同理
                    // 测试用例 -2 0 0 1 2 2 4
                    //不跳过的话会出现2个相同的解
                    result.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L < R && nums[L] == nums[L + 1]) L++;
                    while (L < R && nums[R] == nums[R - 1]) R--;
                    L++;
                    R--;
                }
                else if (sum < 0){
                    L ++ ;
                }
                else {
                    R --;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Test15 test15 = new Test15();
        int[] nums =  new int[]{-2, 0, 0, 2, 2, 4};
        System.out.println(test15.threeSum(nums));
    }
}
