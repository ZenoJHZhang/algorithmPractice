package easy;

import java.util.*;

/**
 * 罗马数字转整数
 * 简单难度
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/6/24 20:18
 */
public class Test13 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int before = 1000;
        int total = 0;
        char[] chars = s.toCharArray();
        for (char c : chars
        ) {
            Integer now = map.get(c);
            total += now;
            if (before < now) {
                total = total - 2 * before;
            }
            before = now;
        }
        return total;
    }

    public static void main(String[] args) {
        Test13 test13 = new Test13();
        System.out.println(test13.romanToInt("IV"));
    }
}
