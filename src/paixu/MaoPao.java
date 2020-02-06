package paixu;

/**
 * 冒泡排序 N2 稳定排序
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/6 15:53
 */
public class MaoPao {
    public static int[] a(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length - 1; j++) {
                int before = array[j];
                int after = array[j + 1];
                if (after < before) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        return array;
    }
}
