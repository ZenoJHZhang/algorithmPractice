package complete;

import importtest.Test3;

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
        Arrays.sort(candidates);
        HashMap<Integer,List<List<Integer>>> map = new HashMap<>();
        for (int i = 1; i <= target; i++) {
            Set<List<Integer>> res = new HashSet<>();
            for (int t:candidates
                 ) {
                if (i == t){
                  List<Integer> a = new LinkedList<>();
                  a.add(t);
                  res.add(a);
                }
                else if (i > t){
                    int n = i - t;
                    boolean key = map.containsKey(n);
                    if (key){
                        List<List<Integer>> list = map.get(n);
                        for (List<Integer> l: list
                             ) {
                            List<Integer> s = new LinkedList<>(l);
                            s.add(t);
                            Collections.sort(s);
                            res.add(s);
                        }
                    }
                }
                map.put(i,new LinkedList<>(res));
            }
        }

        return map.get(target);
    }

    public static void main(String[] args) {
        Test39 test39 = new Test39();
        int [] nums = new  int[]{2,3,6,7};
        List<List<Integer>> list = test39.combinationSum(nums, 0);
        System.out.println(list);
    }
}