class Solution {

    public void solve(int col, char[][] board, List<List<String>> ans, int n, int[] left, int[] lowDiagonal,
            int[] upDiagonal) {
        if (col == n) {
            ans.add(construct(board));
            return;
        }
       

        for (int row = 0; row < n; row++) {
            if (left[row] == 0 && lowDiagonal[row + col] == 0 && upDiagonal[(n - 1) + col - row] == 0) {
                board[row][col] = 'Q';
                left[row] = 1;
                lowDiagonal[row + col] = 1;
                upDiagonal[(n - 1) + (col - row)] = 1;
                solve(col + 1, board, ans, n, left, lowDiagonal, upDiagonal);
                left[row] = 0;
                lowDiagonal[row + col] = 0;
                upDiagonal[(n - 1) + (col - row)] = 0;
            }
        }
    }

    public List<String> construct(char[][] board) {
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            ans.add(s);
        }
        return ans;
    }
    
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        int[] left = new int[n];
        int[] lowDiagonal = new int[2 * n - 1];
        int[] upDiagonal = new int[2 * n - 1];
        solve(0, board, ans, n, left, lowDiagonal, upDiagonal);
        return ans.size();
    }
}
