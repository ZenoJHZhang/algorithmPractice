package complete;

import java.util.LinkedList;
import java.util.List;

/**
 * 杨辉三角
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/6 10:01
 */
public class Test118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new LinkedList<>();
        for (int i = 1; i <= numRows ; i++) {
            List<Integer> integerList = new LinkedList<>();
            if (i == 1){
                integerList.add(1);
                list.add(integerList);
            }
            else {
                List<Integer> before = list.get(i-2);
                for (int j = 0; j < i ; j++) {
                    if (j == 0 || j == i - 1){
                        integerList.add(1);
                    }
                    else {
                        int n = before.get(j-1)+before.get(j);
                        integerList.add(n);
                    }
                }
                list.add(integerList);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Test118 test118 = new Test118();
        System.out.println(test118.generate(5));
    }
}
