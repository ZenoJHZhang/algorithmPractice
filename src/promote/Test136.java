package promote;

/**
 * 只出现一次的数字
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/9 20:58
 */
public class Test136 {
    //异或的使用学习
    // a^a = 0 ;0 ^ a = a
    // 相当于对 a，b 二进制化，并比较每一位，相同为0，不相同为1
    // 2：0010；3：0011 异或 => 0001
    // 0:0000 ; 3:0011 异或还是 3 （这是这道题核心）
    public int singleNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            count ^= num;
        }
        return count;
    }
}
