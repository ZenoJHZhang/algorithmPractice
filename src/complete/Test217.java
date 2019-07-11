package complete;

import java.util.HashSet;
import java.util.Set;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/11 21:18
 */
public class Test217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n:nums
             ) {
            set.add(n);
        }
        return set.size() != nums.length;
    }

    public static void main(String[] args) {
        Test217 test217 = new Test217();
        test217.containsDuplicate(new int[]{1,2,3,1});
    }
}
