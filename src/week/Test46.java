package week;

import java.util.ArrayList;
import java.util.List;

/**
 * 全排列 回溯经典
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/1/8 19:56
 */
public class Test46 {
    public List<List<Integer>> permute(int[] nums) {
        // 首先是特判
        int len = nums.length;
        // 使用一个动态数组保存所有可能的全排列
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> track = new ArrayList<>();
        if (len == 0) {
            return res;
        }

        back(nums, track, res);
        return res;

    }

    /**
     * @param nums  路径
     * @param track 选择
     */
    private void back(int[] nums, List<Integer> track, List<List<Integer>> res) {
        //路径等于选择的长度 终止态
        if (nums.length == track.size()) {
            res.add(new ArrayList<>(track));
            return;
        }

        // for 选择 in 选择集
        for (int num : nums) {
            //排除错误选择
            if (track.contains(num)) {
                continue;
            }
            //做选择
            track.add(num);
            //执行方法
            back(nums, track, res);
            //撤销选择
            track.remove(track.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Test46 test46 = new Test46();
        List<List<Integer>> lists = test46.permute(nums);
        System.out.println(lists);
    }
}
