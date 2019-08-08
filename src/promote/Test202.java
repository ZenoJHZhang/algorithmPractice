package promote;

import java.util.HashSet;
import java.util.Set;

/**
 * 快乐数
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/10 21:03
 */
public class Test202 {
    //非快乐数的结果必定会陷入死循环，所以只要将结果一个个加入结果集
    //然后每次判断结果集中有无计算出的结果即可
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        if (n == 1) {
            return true;
        }
        int result = n;
        while (result != 1 && !set.contains(result) ){
            set.add(result);
            int e = result;
            result = 0;
            while (e > 0){
                int t = e % 10;
                t = t * t;
                e = e / 10;
                result += t;
            }
        }
        return result == 1;
    }

    public static void main(String[] args) {
        System.out.println(4&3);
    }
}
