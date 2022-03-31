class Solution {
    public int splitArray(int[] nums, int m) {
        int max_val = 0;
        int sum = 0;

        for (int val : nums) {
            sum += val;
            max_val = Math.max(max_val, val);
        }

        int lo = max_val;
        int hi = sum;
        int max_sum = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (fun(nums, mid) <= m) {
                max_sum = mid;
                hi = mid - 1;
               
            } else {
                lo = mid + 1;
                
            }
        }
        return max_sum;

    }

    public static int fun(int[] nums, int mid) {
        int sum = 0;
        int c = 1;

        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] <= mid) {
                sum += nums[i];
            } else {
                sum = nums[i];
                c++;
            }
        }
        return c;
    }
}
