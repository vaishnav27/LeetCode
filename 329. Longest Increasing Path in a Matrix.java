class Solution {
    int[][] dir = { { 1, 0 }, { 0, 1 }, { 0, -1 }, { -1, 0 } };

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return 0;
        int m = matrix.length, n = matrix[0].length;
        int[][] memo = new int[m][n];
        int longestPath = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int path = dfs(m, n, i, j, matrix, memo);
                longestPath = Math.max(longestPath, path);
            }
        }
        return longestPath;
    }

    public int dfs(int m, int n, int i, int j, int[][] mat, int[][] memo) {
        if (memo[i][j] > 0)
            return memo[i][j];
        int max = 0;
        for (int[] d : dir) {
            int x = i + d[0], y = j + d[1];
            if (x >= 0 && y >= 0 && x < m && y < n && mat[x][y] > mat[i][j]) {
                max = Math.max(max, dfs(m, n, x, y, mat));
            }
        }
        memo[i][j] = max + 1;
        return max + 1;
    }
}
