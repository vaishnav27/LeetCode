
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();

        if (nums.length == 1) {
            ans.add(nums[0] + "");
            return ans;
        }

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];

            while (i + 1 < nums.length && (nums[i + 1] - nums[i]) == 1) {
                i++;
            }
            if (a != nums[i])
                ans.add(a + "->" + nums[i]);
            else
                ans.add(a + "");

        }
        return ans;
    }
}
