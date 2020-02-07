package paixu;

/**
 * 快速排序
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/7 12:54
 */
public class KaiPai {
    public static void a(int[] array) {
        quickSort(array,0,array.length - 1);
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        int start = left;
        int end = right;
        int temp = array[start];
        while (left != right) {
            //必须用while，一直找，直到左边的数小于基准数，或者和右边碰面
            while (array[right] >= temp && left < right) {
                right--;
            }
            while (array[left] <= temp && left < right) {
                left++;
            }
            if (left < right) {
                int t = array[left];
                array[left] = array[right];
                array[right] = t;
            }
        }
        //交换基准数和碰面点
        array[start] = array[left];
        array[left] = temp;
        quickSort(array, start, left - 1);
        quickSort(array, left + 1, end);
    }
}
