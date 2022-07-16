class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        long[][][] memo = new long[m + 1][n + 1][maxMove + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                for (int j2 = 0; j2 < maxMove + 1; j2++) {
                    memo[i][j][j2] = -1;
                }
            }
        }
        return (int)findMaxPath(m, n, maxMove, startRow, startColumn, memo);
    }

    public long findMaxPath(int m, int n, int maxMove, int r, int c, long[][][] memo) {
        if (maxMove < 0)
            return 0;

        if (r == m || c == n || r < 0 || c < 0) {
            return 1;
        }
        if (memo[r][c][maxMove] != -1) {
            return memo[r][c][maxMove];
        }

        long total = 0;
        long top = findMaxPath(m, n, maxMove - 1, r - 1, c, memo);
        long bottom = findMaxPath(m, n, maxMove - 1, r + 1, c, memo);
        long left = findMaxPath(m, n, maxMove - 1, r, c - 1, memo);
        long right = findMaxPath(m, n, maxMove - 1, r, c + 1, memo);

        total = ((top + bottom + left + right) % 1000000007);
        memo[r][c][maxMove] = total;

        return total;
    }
}
