package paixu;

/**
 * 选择排序 N2 非稳定排序
 * 在第N趟中，遍历N-1个数，选出最小的和第n个数交换
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/6 16:08
 */
public class XuanZe {
    public static int[] a(int [] array){
        for (int i = 0; i < array.length - 1 ; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min){
                    min = array[j];
                    minIndex = j;
                }
            }
            int t = array[minIndex];
            array[minIndex] = array[i];
            array[i] = t;
        }
        return array;
    }
}
