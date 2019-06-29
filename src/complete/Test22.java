package complete;

import java.util.LinkedList;
import java.util.List;

/**
 * 括号生成
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/6/29 10:00
 */
public class Test22 {

    private List<String> result = new LinkedList<>();

    public List<String> generateParenthesis(int n) {

        hander(n, n, "");
        return result;
    }


    //基准是 队列中左括号数目必须要大于等于右括号数目，即剩余的左括号小于等于右括号，即 left <= right
    // left == 0时，放入剩余右括号
    public void hander(int left, int right, String s) {
        if (left == 0) {
            while (right > 0) {
                right--;
                s += ")";
            }
            result.add(s);
        } else {
            //剩余的左括号 == 右括号时，放入左括号，并改变s
            if (left == right) {
                hander(left - 1, right, s + "(");
             //剩余的左括号 < 右括号时，说明队列中左括号大于右括号，可选择放入左括号或者右括号
            } else if (left < right) {
                hander(left - 1, right, s + "(");
                hander(left, right - 1, s + ")");
            }
        }
    }

    public static void main(String[] args) {
        Test22 test22 = new Test22();
        System.out.println(test22.generateParenthesis(2).toString());
    }


}
