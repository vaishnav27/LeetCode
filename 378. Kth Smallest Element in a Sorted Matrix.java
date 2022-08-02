class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        /*
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                pq.offer(matrix[i][j]);
            }
        }
        while (pq.size() != k) {
            pq.poll();
        }
        return pq.peek();
        */
        
        int n = matrix.length;
        int lo = matrix[0][0], hi = matrix[n - 1][n - 1];

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int count = fun(matrix, mid);
            if (count < k) {
                lo = mid + 1;
            } else
                hi = mid;
        }
        return lo;
    }
      public int fun(int[][] mat, int tar) {
        int count = 0, n = mat.length, i = n - 1, j = 0;

        while (i >= 0 && j < n) {
            if (mat[i][j] > tar)
                i--;
            else{
                count += i + 1;
                 j++;
            }
        }
        return count;
    }
}
