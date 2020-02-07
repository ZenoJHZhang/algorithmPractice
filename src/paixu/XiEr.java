package paixu;

/**
 * 希尔排序
 *
 * 一个增量值 incr，每次比较以后变小，直到变为1，1的时候使用插入排序比较（数组基本有序时，插入排序效率高）
 * 比较 array[i] 和 array【i + incr】和 array【i + incr + incr】的大小...........（直到这个值大于length）
 * 也就是一组比较可能有多个项目
 * @author 张江浩
 * @version 1.00
 * @date 2020/2/6 16:49
 */
public class XiEr {
    public static void a (int [] array){
        int incr = array.length / 2;
        while (incr >= 1){
            //1.选出各组的起始点
            for (int i = 0; i < incr; i++) {
                //2.分组 注意要小于等于array.length，否则最后一个数不会被加进去
                for (int j = i; j + incr <= array.length ;j = j + incr ) {
                    //3.组内比较。倒序比较。直到比到本组倒数第二个组。
                    //即倒数第二个数和倒数第一个比较谁最小
                    for (int k = j; k >= i + incr ; k-= incr) {
                        if (array[k] < array[k - incr]){
                            int t = array[k];
                            array[k] = array[k - incr];
                            array[k - incr] = t;
                        }
                    }
                }
                incr = incr / 2;
            }
        }
    }
}
