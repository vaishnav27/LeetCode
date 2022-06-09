class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length<2) {
            return new int[] { 1, 2 };
        }
        int[] ans = new int[2];
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int mid = numbers[left] + numbers[right];

            if (mid == target) {
                ans[0] = left + 1;
                ans[1] = right + 1;
                break;
            } else if (target < mid) {
                right--;
            } else {
                left++;
            }
        }
        return ans;
    }
}
