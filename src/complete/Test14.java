package complete;

/**
 * 最长公共前缀
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/6/27 20:41
 */
public class Test14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
      String s = strs[0];
        for (String str : strs) {
            int j = 0;
            for (; j < s.length() && j < str.length(); j++) {
                if (str.charAt(j) != s.charAt(j)) {
                    break;
                }
            }
            s = s.substring(0, j);
        }
        return s;
    }

    public static void main(String[] args) {
        Test14 test14 = new Test14();
        String [] strs = new String[]{"ac","abc","acc"};
        System.out.println(test14.longestCommonPrefix(strs));
    }
}
