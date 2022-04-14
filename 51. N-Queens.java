class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        int[] left_row = new int[n];
        int[] upper_diagonal = new int[2 * n - 1];
        int[] lower_diagonal = new int[2 * n - 1];

        solve(0, board, ans, left_row, upper_diagonal, lower_diagonal);

        return ans;
    }

    private void solve(int col, char[][] board, List<List<String>> ans, int[] left_row, int[] upper_diagonal,
            int[] lower_diagonal) {
        if (col == board.length) {
            ans.add(construct(board));
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (left_row[row] == 0 && lower_diagonal[row + col] == 0
                    && upper_diagonal[board.length - 1 + row - col] == 0) {
                board[row][col] = 'Q';
                left_row[row] = 1;
                lower_diagonal[row + col] = 1;
                upper_diagonal[board.length - 1 + row - col] = 1;
                solve(col + 1, board, ans, left_row, upper_diagonal, lower_diagonal);
                board[row][col] = '.';
                left_row[row] = 0;
                lower_diagonal[row + col] = 0;
                upper_diagonal[board.length - 1 + row - col] = 0;

            }
        }
    }

    private List<String> construct(char[][] board) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            ans.add(s);
        }
        return ans;
    }
}
