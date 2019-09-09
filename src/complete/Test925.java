package complete;

/**
 * 长按键入
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/9/6 15:40
 */
public class Test925 {
    public boolean isLongPressedName(String name, String typed) {
        char[] c1 = name.toCharArray();
        char[] c2 = typed.toCharArray();

        int p1 = 0, p2 = 0;
        while (p1 < c1.length && p2 < c2.length) {
            if (c1[p1] == c2[p2]) {
                p1++;
            }
            p2++;
        }

        return p1 == c1.length;
    }

    public static void main(String[] args) {
        Test925 test925 = new Test925();
        System.out.println(test925.isLongPressedName("leed", "lleed"));
    }
}
