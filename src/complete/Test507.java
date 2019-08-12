package complete;

import java.util.LinkedList;
import java.util.List;

/**
 * 完美数
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/8/9 15:10
 */
public class Test507 {
    public boolean checkPerfectNumber(int num) {
        if (num == 1 || num == 0){
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        int sum = 0;
        for (int i = 1; i <= sqrt; i++) {
            if (i == 1) {
                sum += i;
            } else {
                if (num % i == 0) {
                    sum += i;
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Test507 test507 = new Test507();
        test507.checkPerfectNumber(35);
    }
}
