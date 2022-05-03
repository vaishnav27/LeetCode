class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int r = mat.length;
        int c = mat[0].length;

        int[][] rangeSum = new int[r + 1][c + 1];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                rangeSum[i + 1][j + 1] = rangeSum[i + 1][j] + rangeSum[i][j + 1] - rangeSum[i][j] + mat[i][j];

            }
        }
        
        int[][] ans = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int r1 = Math.max(0, i - k), c1 = Math.max(0, j - k), r2 = Math.min(r, i + k+1), c2 = Math.min(c, j + k+1);
                ans[i][j] = rangeSum[r2][c2] - rangeSum[r2][c1] - rangeSum[r1][c2] + rangeSum[r1][c1];
            }
        }
        return ans;

    }
}
