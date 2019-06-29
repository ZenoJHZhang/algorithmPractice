package complete;

import java.util.Stack;

/**
 * 有效的括号
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/6/29 09:46
 */
public class Test20 {
    public boolean isValid(String s) {

        if (s.equals("")){
            return true;
        }
        char a = '(';
        char b = '[';
        char c = '{';
        char d = ')';
        char e = ']';
        char f = '}';
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c1:chars
             ) {
          if (c1 == a || c1 == b || c1 == c){
              stack.push(c1);
          }
          else {
              if (stack.empty()){
                  return false;
              }
             else {
                 if (c1 == d){
                      if (stack.pop() != a){
                          return false;
                      }
                  }
                  if (c1 == e){
                      if (stack.pop() != b){
                          return false;
                      }
                  }
                  if (c1 == f){
                      if (stack.pop() != c){
                          return false;
                      }
                  }
              }
          }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Test20 test20 = new Test20();
        System.out.println(test20.isValid("()[{}"));
    }
}
