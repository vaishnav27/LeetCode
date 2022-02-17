
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        findCombination(0, candidates, target, ans, new ArrayList<>());
        return ans;

    }

    public void findCombination(int ind, int[] arr, int target, List<List<Integer>> res, List<Integer> ds) {
        if (ind == arr.length) {
            if (target == 0) {
                res.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombination(ind, arr, target - arr[ind], res, ds);
            ds.remove(ds.size() - 1);
        }
        findCombination(ind + 1, arr, target, res, ds);
    }
}
