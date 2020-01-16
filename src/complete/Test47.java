package complete;

import java.util.*;

/**
 * 全排列 II
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/1/16 16:45
 */
public class Test47 {
    /**
     * 重点是剪枝
     * 剪枝前先排序，利于剪枝
     * 是否用过数组 used[] 标记元素是否用过
     * 一个数不能被重复使用
     * 一个数的前一个数如果被用过，且前一个等于它。剪枝
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> track = new LinkedList<>();
        Arrays.sort(nums);
        int[] used = new int[nums.length];
        back(nums, res, track, used);
        return res;
    }

    private void back(int[] nums, List<List<Integer>> res, List<Integer> track, int[] used) {
        if (track.size() == nums.length) {
            List<Integer> t = new LinkedList<>(track);
            res.add(t);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int use = used[i];
            if (use == 1) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == 1) {
                break;
            }
            track.add(n);
            used[i] = 1;
            back(nums, res, track, used);
            track.remove(track.size() - 1);
            used[i] = 0;
        }
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        Test47 test47 = new Test47();
        List<List<Integer>> lists = test47.permuteUnique(nums);
        System.out.println(lists);
    }
}
