class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        int[] ans = new int[] { -1, -1 };

        while (lo <=hi) {
            int mid = (lo + hi) / 2;

            if (target == nums[mid]) {
                ans[0] = mid;
                hi = mid - 1;
            } else if (target > nums[mid]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        
        lo=0;
        hi=nums.length-1;
        
        while (lo <=hi) {
            int mid = (lo + hi) / 2;

            if (target == nums[mid]) {
                ans[1] = mid;
                lo = mid + 1;
            } else if (target > nums[mid]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return ans;
    }
}
