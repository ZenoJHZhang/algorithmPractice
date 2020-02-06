package paixu;

/**
 * 插入排序 N2 稳定排序
 * 假定前n-1个数已经排好了，为第n个数找位置
 * 就是打牌鸭
 * 排好了 3 7 8 K
 * 进来一个10
 * 先和K比较，比K小，10和K换位置
 * 在和8比较，比8大，不换位置，结束循环
 * 就排好了
 *
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/6 16:23
 */
public class ChaRu {
    public static int[] a(int[] array){
        //第N趟
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if (array[j] < array[j - 1]){
                    int t = array[j];
                    array[j] =  array[j - 1];
                    array[j - 1] = t;
                }
                else {
                    break;
                }
            }
        }
        return array;
    }
}
