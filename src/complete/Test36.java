package complete;

import java.util.HashMap;
import java.util.Map;

/**
 * 有效的数独
 *
 * @author 张江浩
 * @version 1.00
 * @date 2019/9/29 10:56
 */
public class Test36 {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Map<Integer, Integer>> row = new HashMap<>();
        Map<Integer, Map<Integer, Integer>> column = new HashMap<>();
        Map<Integer, Map<Integer, Integer>> block = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            row.put(i, new HashMap<>());
            column.put(i, new HashMap<>());
            block.put(i, new HashMap<>());
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int num = (int) c;
                    int blockNum = (i / 3) * 3 + (j / 3);

                    Map<Integer, Integer> rI = row.get(i);
                    Map<Integer, Integer> cI = column.get(j);
                    Map<Integer, Integer> bI = block.get(blockNum);

                    if (!rI.containsValue(num) && !cI.containsValue(num) && !bI.containsValue(num)) {
                        rI.put(j, num);
                        cI.put(i, num);
                        int size = bI.size();
                        bI.put(size,num);
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Test36 test36 = new Test36();
        char[][] board = new char[][]{{'8', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(test36.isValidSudoku(board));
    }
}
