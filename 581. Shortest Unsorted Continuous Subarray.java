class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int l = Integer.MAX_VALUE, r = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    r = Math.max(r, j);
                    l = Math.min(l, i);
                }
            }
        }
        return r - l < 0 ? 0 : r - l + 1;
    }
}


class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] unsorted = nums.clone();
        Arrays.sort(nums);

        int left = 0;
        int right = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != unsorted[i]) {
                left = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != unsorted[i]) {
                right = i;
                break;
            }
        }
        return right - left > 0 ? right - left + 1 : 0;
    }
}
