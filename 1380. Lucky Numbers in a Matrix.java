
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] min_row = new int[m];
        int[] max_col = new int[n];
        Arrays.fill(min_row, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                min_row[i] = Math.min(matrix[i][j], min_row[i]);
                max_col[j] = Math.max(matrix[i][j], max_col[j]);
            }
        }
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (min_row[i] == max_col[j])
                    ans.add(min_row[i]);
            }
        }
        return ans;
    }
}
