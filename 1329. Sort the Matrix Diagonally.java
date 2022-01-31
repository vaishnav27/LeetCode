class Solution {
    public int[][] diagonalSort(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i < n; i++) {
            sort(mat, 0, i, m, n);
        }
        for (int i = 1; i < m; i++) {
            sort(mat, i, 0, m, n);
        }

        return mat;

    }

    public void sort(int[][] mat, int row, int col, int m, int n) {
        int[] count = new int[101];

        int r = row;
        int c = col;

        while (r < m && c < n) {
            count[mat[r][c]]++;
            r++;
            c++;
        }
        r = row;
        c = col;
        for (int i = 0; i < 101; i++) {
            if (count[i] > 0) {
                int x = count[i];
                while (x-- > 0) {
                    mat[r][c] = i;
                    r++;
                    c++;
                }
            }
        }

    }
}
