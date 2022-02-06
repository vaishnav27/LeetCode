class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int i = 0, j = 1, n = nums.length;

        while (i < n && j < n) {

            if (nums[i] % 2 == 0 && i < n) {
                i += 2;
            }

            if (nums[j] % 2 != 0 && j < n) {
                j += 2;
            }

            if (i < n && j < n) {
                swap(nums, i, j);
            }
        }
        return nums;

    }

    public void swap(int[] nums, int i, int j) {
       
       int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
