class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] >= nums[i]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 0;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i + 1] >= nums[i])
                right[i] = right[i + 1] + 1;
            else
                right[i] = 0;
        }

        for (int i = 1; i < n - 1; i++) {
            if (right[i+1] >= k-1 && left[i-1] >=k-1)
                ans.add(i);
        }

        return ans;
    }
}
