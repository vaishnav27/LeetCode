

class Solution {
    public int removeCoveredIntervals(int[][] A) {
        int ans = 0;
        int right = -1;
        int left = -1;

        Arrays.sort(A, (a, b) -> a[0] - b[0]);

        for (int[] x : A) {
            if (x[0] > left && x[1] > right) {
                left = x[0];
                ans++;
            }
            right = Math.max(right, x[1]);
        }
        return ans;

    }
}
