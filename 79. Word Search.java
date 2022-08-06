class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length, m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;

    }

    public boolean dfs(char[][] board, String word, int count, int i, int j) {
        if (count == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i == board.length || j == board[0].length || board[i][j] != word.charAt(count)) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '*';
        boolean found=(dfs(board, word, count + 1, i + 1, j)
        || dfs(board, word, count + 1, i -1, j)
        || dfs(board, word, count + 1, i, j+1)
                || dfs(board, word, count + 1, i, j - 1));
                
        board[i][j] = temp;
        return found;
    }
}
