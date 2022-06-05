class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
       
        
        while (n >1) {
            for (int i = 0; i < n/2; i++) {
                if (i % 2 == 0) {
                   nums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                }
                if (i % 2 != 0) {
                    nums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            n =n / 2;
        }
        return nums[0];
    }
}
