package easy;

import java.util.LinkedList;
import java.util.List;

/**
 * 简化路径
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/6/27 20:56
 */
public class Test71 {
    public String simplifyPath(String path) {
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

        //代表点的数量
        int index = 0;
        List<String> list = new LinkedList<>();
        String a = "";
        //判断是否两个连点
        char point = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c != '/' && c != '.') {
                a += c;
            } else if (c == '/' && i != 0) {
                list.add(a);
                a = "";
            }
            if (i == chars.length - 1) {
                list.add(a);
            }
            if (point == '.' && point == c) {
                list.add("..");
                index++;
            }
            point = c;
        }
        if (index >= list.size()) {
            return "/";
        }
        String t = "";
        List<String> r = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("..")) {
                r.remove(i - 1);
            } else {
                r.add(list.get(i));
            }
        }
        for (String s1 :r
             ) {
            t += "/";
            t += s1;
        }
        return t;
    }

    /**
     * "/a//b////c/d//././/.."
     */
    public static void main(String[] args) {
        Test71 test71 = new Test71();
        System.out.println(test71.simplifyPath("/a//b////c/d//././/.."));
    }

}
