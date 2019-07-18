package complete;

/**
 * 汉明距离
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/18 20:13
 */
public class Test461 {
    public int hammingDistance(int x, int y) {
        int i = x ^ y;
        String string = Integer.toBinaryString(i);
        string = string.replace("0", "");
        return string.length();
    }


    public static void main(String[] args) {
        Test461 test461 = new Test461();
        System.out.println(test461.hammingDistance(1, 4));
    }
}
