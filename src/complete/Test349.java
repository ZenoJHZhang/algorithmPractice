package complete;

import java.util.HashSet;
import java.util.Set;

/**
 * 两个数组的交集
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/8/8 17:37
 */
public class Test349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int i:nums1
             ) {
            set.add(i);
        }
        for (int j:nums2
             ) {
            if(set.contains(j) && !result.contains(j)){
              result.add(j);
            }
        }
        int[] res = new int[result.size()];
        int k = 0;
        for (Integer integer:result
             ) {
            res[k] = integer;
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        int [] a = new int[]{4,5,9};
        int [] b = new int[]{5,2,6,7};
        Test349 test349 = new Test349();
        System.out.println(test349.intersection(a, b).length);
    }
}
