package complete;

import java.util.LinkedList;
import java.util.List;

/**
 * N皇后
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/11/3 10:09
 */
public class Test51 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new LinkedList<>();
        int [] arr = new int[n];
        return findQuene(0,n,result,arr);
    }


    List<List<String>> findQuene(int k,int n ,  List<List<String>> result,int [] arr){
        if (k == n){
            result.add(make(arr));
            return result;
        }
        for (int i = 0; i < n; i++) {
            if (comp(k,i,arr)){
                arr[k] = i;
                findQuene(k+1,n,result,arr);
            }
        }
        return result;
    }

    //arr[i] = k ，第几行第几个放皇后
    public boolean comp(int row, int col, int[] arr) {
        for (int i = 0; i < row; i++)
        {
            if (col == arr[i] || Math.abs(row - i) == Math.abs(col - arr[i])) {
                return false;
            }
        }
        return true;
    }

    public List<String> make(int[] arr) {
        List<String> result = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            int t = arr[i];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < arr.length; j++) {
                sb.append(".");
            }
            sb.replace(t,t+1,"Q");
            result.add(sb.toString());
        }
        return result;
    }

    public static void main(String[] args) {
        Test51 test51 = new Test51();
        System.out.println(test51.solveNQueens(6));
    }
}
