package complete;

import java.util.*;

/**
 * 组合总和
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/9/30 10:00
 */
public class Test39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Map<Integer, Set<List<Integer>>> tempMap = new HashMap<>();

        Arrays.sort(candidates);

        int len = candidates.length;

        for (int i = 1; i <= target; i++) {
            tempMap.put(i,new HashSet<>());
            for (int candidate : candidates) {
                if (candidate == i) {
                    List<Integer> list = new LinkedList<>();
                    list.add(candidate);
                    tempMap.get(i).add(list);
                } else if (candidate < i) {
                    int key = i - candidate;
                    Set<List<Integer>> set = tempMap.get(key);
                    if (set.size() != 0) {
                        for (List<Integer> list : set
                        ) {
                            List<Integer> integerList = new LinkedList<>(list);
                            integerList.add(candidate);
                            Collections.sort(integerList);
                            tempMap.get(i).add(integerList);
                        }
                    }
                }

            }
        }
        Set<List<Integer>> listSet = tempMap.get(target);
        return new LinkedList<>(listSet);
    }


    public static void main(String[] args) {
        Test39 test39 = new Test39();
        int [] c = new int[]{2,3,7};
        int target = 7;
        List<List<Integer>> list = test39.combinationSum(c, target);
        System.out.println(list);
    }
}
