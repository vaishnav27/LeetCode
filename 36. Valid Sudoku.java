//Optimal Solution
class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashMap<Integer, Integer> [] row = new HashMap[9];
        HashMap<Integer, Integer> [] column = new HashMap[9];
        HashMap<Integer, Integer> [] box = new HashMap[9];
        
        for (int i = 0; i < 9; i++) {
            row[i] = new HashMap<Integer, Integer>();
            column[i] = new HashMap<Integer, Integer>();
            box[i] = new HashMap<Integer, Integer>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    int n = (int) num;
                    int box_index = (i / 3) * 3 + j / 3;

                    row[i].put(n, row[i].getOrDefault(n, 0) + 1);
                    column[j].put(n, column[j].getOrDefault(n, 0) + 1);
                    box[box_index].put(n, box[box_index].getOrDefault(n, 0) + 1);

                    if (row[i].get(n) > 1 || column[j].get(n) > 1 || box[box_index].get(n) > 1) {
                        return false;

                    }
                }
            }
        }
        return true;
        
    }
}
