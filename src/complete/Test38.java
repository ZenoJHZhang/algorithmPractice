package complete;

/**
 * 报数
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/1 20:04
 */
public class Test38 {
    public String countAndSay(int n) {

        //最开始字符串
        String str = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder s = new StringBuilder();
            //字符串最开始的那个数字
            char pre = str.charAt(0);
            int count = 1;
            for (int j = 1; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == pre) {
                    count++;
                } else {
                    s.append(count).append(pre);
                    pre = c;
                    count = 1;
                }
            }
            s.append(count).append(pre);
            str = s.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        Test38 test38 = new Test38();
        System.out.println(test38.countAndSay(4));
    }
}