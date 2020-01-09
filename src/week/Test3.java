package week;

import java.util.HashSet;
import java.util.Set;

/**
 * 无重复字符的最长子串
 * <p>
 * 滑动窗口法
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/1/7 19:36
 */
public class Test3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> characters = new HashSet<>();
        int n = s.length();
        int i = 0;
        int j = 0;
        int max = 0;
        while (i < n && j < n) {
            //判断是否已重复 是的话 移除集合中的重复项，滑动窗口左端右移；否则滑动窗口右端右移
            if (!characters.contains(s.charAt(j))) {
                characters.add(s.charAt(j));
                j++;
                max = Math.max(max, characters.size());
            } else {
                characters.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        System.out.println(test3.lengthOfLongestSubstring("asjrgapa"));
    }
}
