class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for (int i : nums) {
            sum += i;
        }
        List<Integer> list = new ArrayList<>();

        int sub_sum = 0;

        for (int i = nums.length - 1; i >=0; i--) {
            sub_sum += nums[i];
            list.add(nums[i]);

            if (sub_sum > sum - sub_sum)
                return list;
        }
        return new ArrayList<>();
    }
}
