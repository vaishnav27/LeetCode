class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        
        for (int row = 0; row < n; row++) {
            for (int col = 1; col < m; col++) {
                matrix[row][col] += matrix[row][col - 1];
            }
        }
        int count = 0;

        for (int col = 0; col < m; col++) {
            for (int col1 = col; col1 < m; col1++) {

                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);

                int sum = 0;
                for (int row = 0; row < n; row++) {
                    sum += matrix[row][col1] - (col > 0 ? matrix[row][col - 1] : 0);
                    count += map.getOrDefault(sum - target, 0);
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }
        return count;
    }
}
