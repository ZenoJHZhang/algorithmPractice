package complete;

/**
 * 盛最多水的容器
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/10/3 09:46
 */
public class Test11 {
    /**
     * 思路很简单
     * 左右两条线段越长越好，加上下面那条最长
     * 所以使用双指针，记录每一次的面积，短线指针往长线移动，可以保证，
     * 无论下面那条线多长，在此情况下，左右两条线都保持最长
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while (i < j ){
            max = Math.max(max, Math.min(height[i],height[j])*(j  -i));
            if (Math.max(height[i],height[j]) == height[j]){
                i++;
            }
            else {
                j--;
            }
        }
        return max;
    }
}
