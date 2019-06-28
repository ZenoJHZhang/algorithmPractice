package promote;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 简化路径
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/6/27 20:56
 */
public class Test71 {
    public String simplifyPath(String path) {
        StringBuilder result = new StringBuilder();
        if (path.equals("")) {
            return "/";
        }
        char[] c1List = path.toCharArray();
        char beforeChar = 0;
        String s = "";
        //去掉多余横杠
        for (int i = 0; i < c1List.length; i++) {
            if (i == c1List.length - 1 && c1List[i] == '/') {
                continue;
            } else if (beforeChar == '/' && beforeChar == c1List[i]) {
                continue;
            } else {
                s += c1List[i];
            }
            beforeChar = c1List[i];
        }

        //切割字符串，第一个为空
        String[] split = s.split("/");

        //处理后的list
        List<String> list = new LinkedList<>();
        //是否全是 ..
        boolean flag = true;
        //是否存在 .. 或 .
        boolean pointFlag = false;
        //连点处理,排除第一个空值
        for (int i = 1; i < split.length; i++) {
            if (split[i].equals(".")) {
                pointFlag = true;
            } else if (split[i].equals("..")) {
                list.add("..");
                pointFlag = true;
            } else {
                list.add(split[i]);
                flag = false;
            }
        }

        if (flag) {
            if (split.length == 1 || split.length == 0) {
                return "/";
            }
            //判断是否存在 .. 和 . ；有的话返回 /
            if (pointFlag) {
                return "/";
            } else {
                for (int i = 1; i < split.length; i++) {
                    result.append("/").append(split[i]);
                }
            }
            return result.toString();
        }

        //有路径入栈 反之遇到 .. 出栈
        //出栈前判断栈内是否有值
        Stack<String> stack = new Stack<>();
        for (String string : list
        ) {
            if (string.equals("..")) {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else {
                stack.push(string);
            }
        }


        if (stack.empty()) {
            return "/";
        }
        //栈反转
        Stack<String> stack1 = new Stack<>();

        while (!stack.empty()) {
            stack1.push(stack.pop());
        }

        while (!stack1.empty()) {
            String string = "/" + stack1.pop();
            result.append(string);
        }
        return result.toString();
    }


    public int countString(String str, String s) {
        int count = 0;
        while (str.contains(s)) {
            str = str.substring(str.indexOf(s) + 1);
            count++;
        }
        return count;
    }

    /**
     * "/a/./b/../../c/"
     * "/a//b////c/d//././/.."
     * "/a/./b/../../c/"
     * /a/../../b/../c/./
     */
    public static void main(String[] args) {
        Test71 test71 = new Test71();
        System.out.println(test71.simplifyPath("/../"));
    }

}
