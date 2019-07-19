package complete;

import java.util.LinkedList;
import java.util.List;

/**
 * 自除数
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/19 20:23
 */
public class Test728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<>();
        for (int i = left; i <= right ; i++) {
            if (String.valueOf(i).contains("0")){
                continue;
            }
            int n = i;
            boolean flag = true;
            while (n> 0){
                int t = n % 10;
                if (i % t != 0){
                    flag = false;
                }
                n = n /10;
            }
            if (flag){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Test728 test728 = new Test728();
        test728.selfDividingNumbers(1,22);
    }
}
