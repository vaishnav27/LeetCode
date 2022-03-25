
class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length / 2;

        int[] refund = new int[n * 2];
        int minCost = 0;
        int i = 0;

        for (int[] cost : costs) {
            refund[i++] = cost[1] - cost[0];
            minCost += cost[0];
        }
        Arrays.sort(refund);

        for (int j = 0; j < n; j++) {
            minCost += refund[j];
        }
        return minCost;
    }
}
