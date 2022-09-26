class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        int count = 0;
        int longest=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                count++;
            } else {
                longest = Math.max(longest, count);
                count = 0;
            }
            
        }
        longest = Math.max(longest, count);
        return longest;
    }
}
