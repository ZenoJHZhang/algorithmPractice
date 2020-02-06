package paixu;

import java.util.Arrays;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/6 16:01
 */
public class Util {
    public static void main(String[] args) {
        int [] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(XiEr.a(array)));
    }
}
