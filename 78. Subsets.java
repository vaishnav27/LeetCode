

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();

        solveSubsets(0, nums, n, list, new ArrayList<Integer>());
        // list.remove(list.get(0));
        return list;

    }

    public static void solveSubsets(int idx, int[] nums, int n, List<List<Integer>> ans, List<Integer> curr) {

        if (!ans.contains(curr)) {
            ans.add(new ArrayList<>(curr));
            // System.out.println(ans);
        }

        for (int i = idx; i < n; i++) {
            curr.add(nums[i]);

            solveSubsets(i + 1, nums, n, ans, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
