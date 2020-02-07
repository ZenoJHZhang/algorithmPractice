package paixu;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/7 16:32
 */
public class Dui {
    public static void a (int [] array){
        for (int i = 0; i < array.length; i++) {
            //每次建堆就可以排除一个元素了
            maxHeap(array, array.length - i);

            //交换
            int temp = array[0];
            array[0] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;

        }
    }


    /**
     * 堆内数据比较
     * @param array
     * @param root
     * @param length
     */
    public static void heapTop(int[] array, int root, int length) {
        int left = root * 2 + 1;
        int right = root * 2 + 2;
        int largeIndex = root;
        if (left < length && array[left] > array[largeIndex]) {
            largeIndex = left;
        }
        if (right < length && array[right] > array[largeIndex]) {
            largeIndex = right;
        }
        if (largeIndex != root) {
            Util.swap(array, root, largeIndex);
            heapTop(array, largeIndex, length);
        }
    }
    
    public static void maxHeap(int[] array,int length){
        for (int i = length -1; i >= 0 ; i--) {
            heapTop(array,i,length);
        }
    }


}
