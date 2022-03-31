class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max_val = 0;
        int sum = 0;

        for (int val : weights) {
            sum += val;
            max_val = Math.max(max_val, val);
        }
        int lo = max_val;
        int hi = sum;

        int ans = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (fun(weights, days, mid) == true) {
                ans = mid;
               
                hi = mid - 1;
                              
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static boolean fun(int[] wt, int days, int mid) {
        int d = 1;
        int sum = 0;

        for (int i = 0; i < wt.length; i++) {
            sum += wt[i];
            if (sum > mid) {
                d++;
                sum = wt[i];
            }
        }
        return d <= days;
    }
}
