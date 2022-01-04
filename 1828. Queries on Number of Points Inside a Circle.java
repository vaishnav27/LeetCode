
class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            for (int j = 0; j < points.length; j++) {
                if ((squared(points[j][0] - queries[i][0]) + squared(points[j][1] - queries[i][1])) <= squared(
                        queries[i][2])) {
                    count++;

                }
            }
            ans[i] = count;
        }
        return ans;
    }

    public int squared(int x) {
        return x * x;
    }

}
