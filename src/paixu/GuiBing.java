package paixu;

/**
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/7 14:44
 */
public class GuiBing {
    public static void a(int[] array) {
        mergerSort(array, 0, array.length - 1);
    }

    public static void mergerSort(int[] array, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        mergerSort(array, left, mid);
        mergerSort(array, mid + 1, right);
        merger(array, left, right, mid);
    }

    public static void merger(int[] array, int left, int right, int mid) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int n = 0;
        while (i <= mid && j <= right) {
            temp[n++] = array[i] < array[j] ? array[i++] : array[j++];
        }
        while (i <= mid) {
            temp[n++] = array[i++];
        }
        while (j <= right) {
            temp[n++] = array[j++];
        }
        for (int k = 0; k < temp.length; k++) {
            array[left + k] = temp[k];
        }
    }
}
