package complete;

import java.util.function.Function;

/**
 * 每日温度
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/9/9 10:55
 */
public class Test739 {
    public int[] dailyTemperatures(int[] T) {
        int [] result = new int[T.length];
        for (int i = 0; i < T.length ; i++) {
            int now = T[i];
            boolean g = false;
            for (int j = i + 1; j < T.length ; j++) {
                if (T[j]  > now){
                    result[i] = j - i;
                    g = true;
                }
                if (g){
                    break;
                }
            }
            if (!g){
                result[i] = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] t = new int[]{73,74,75,71,69,72,76,73};
        Test739 test739 = new Test739();
        test739.dailyTemperatures(t);
        String s = "23";
        Function<String, Integer> stringIntegerFunction = String::length;
        stringIntegerFunction.apply("23");
    }
}
