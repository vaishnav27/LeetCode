class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < row; i++) {
            int[] colSum = new int[col];
            for (int j = i; j < row; j++) {
                for (int c = 0; c < col; c++) {
                    colSum[c] += matrix[j][c];
                    // System.out.print(colSum[c]+" ");
                }
                // System.out.println();
                
                max = Math.max(max, find(colSum, k));
            }
        }
        return max;
    }

    public int find(int[] sum, int k) {
        int prefix = 0;
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < sum.length; i++) {
            prefix += sum[i];

            Integer tar = set.ceiling(prefix - k);

            if (tar != null) {
                res = Math.max(res, prefix - tar);
            }
            set.add(prefix);
        }
        return res;
    }

}
