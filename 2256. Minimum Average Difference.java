class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum = 0;
        long curr = 0;
        long n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int ans = 0;
        long min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];

            long avg1 = curr / (i + 1);
            if (i == n - 1) {
                if (avg1 < min)
                    return (int)(n - 1);
                else
                    break;
            }
            long avg2 = (sum - curr) / (n - i - 1);

            if (Math.abs((avg1 - avg2)) < min) {
                min = Math.abs((avg1 - avg2));
                ans = i;
            }

        }
        return ans;

    }

}
