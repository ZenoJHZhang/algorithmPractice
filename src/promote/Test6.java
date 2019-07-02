package promote;

/**
 * Z 字形变换
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/7/2 20:07
 */

/**
 * 重点在画图获取  *竖斜*  变换规律
 */
public class Test6 {
    public String convert(String s, int numRows) {
       if (numRows == 1){
           return s;
       }
       //行数 ，防止字符串不够一列
       int line = Math.min(s.length(),numRows);

       String [] strings = new String[line];
       //初始化字符串数组
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "";
        }

       //是否变换  true 从竖到斜 ； false 从斜到竖
       boolean down  = false;
       //加到第几个字符串中
       int loc = 0;
        for (int i = 0; i < s.length() ; i++) {
            //切一个字符加上
            strings[loc] += s.substring(i,i+1);
            //这种情况会切换
            if (loc == 0 || loc % (numRows-1) == 0){
                down = !down;
            }
            if (down){
                loc ++;
            }
            else {
                loc --;
            }
        }

        StringBuilder result = new StringBuilder();
        for (String t:strings
             ) {
            result.append(t);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Test6 test6 = new Test6();
        test6.convert("PAYPALISHIRING" ,
                3);
    }
}
