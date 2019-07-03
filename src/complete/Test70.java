package complete;

/**
 * 类的说明
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/3 20:50
 */
public class Test70 {
    public int climbStairs(int n) {
        int one = 1;
        int two = 2;
        if (n == 1){
            return  1;
        }
        if (n == 2){
            return 2;
        }
        int before1 = 2;
        int before2 = 1;
        int result = 0;
        for (int i = 3; i <= n ; i++) {
            result = before1 + before2;
            before2 = before1;
            before1 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Test70 test70 = new Test70();
        System.out.println(test70.climbStairs(4));
    }
}
