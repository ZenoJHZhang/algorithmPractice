package complete;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 组合总和 II
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/1/15 19:51
 */
public class Test40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Map<Integer,List<List<Integer>>> map = new HashMap<>();
        Map<Integer,Integer> per = new HashMap<>();
        for (int a : candidates) {
            if (!per.containsKey(a)) {
                per.put(a, 1);
            } else {
                int amount = per.get(a);
                amount = amount + 1;
                per.put(a, amount);
            }
        }

        for (int i = 1; i <= target ; i++) {
            List<List<Integer>> res = new LinkedList<>();
            for (int t : candidates) {
                if (t == i) {
                    List<Integer> l = new LinkedList<>();
                    l.add(t);
                    if (!res.contains(l)) {
                        res.add(l);
                    }                } else if (i > t) {
                    int n = i - t;
                    boolean key = map.containsKey(n);
                    if (key) {
                        List<List<Integer>> list = map.get(n);
                        for (List<Integer> l : list
                        ) {
                            List<Integer> s = new LinkedList<>(l);
                            if (!s.contains(t)) {
                                s.add(t);
                                Collections.sort(s);
                                if (!res.contains(s)) {
                                    res.add(s);
                                }
                            } else if (s.contains(t) && judgeAmount(s, per, t)) {
                                s.add(t);
                                Collections.sort(s);
                                if (!res.contains(s)) {
                                    res.add(s);
                                }
                            }
                        }
                    }
                }
            }
            map.put(i,new LinkedList<>(res));
        }
        return map.get(target);
    }

    private boolean judgeAmount(List<Integer> source, Map<Integer,Integer> per, int t){
        int amount = (int)source.stream().filter(f -> f == t).count();
        amount = amount + 1;
        return per.get(t) >= amount;
    }


    public static void main(String[] args) {
        Test40 test40 = new Test40();
        int [] nums = new  int[]{1,1};
        System.out.println(test40.combinationSum2(nums, 1));
    }
}
