class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(ans, candidates, 0, target, new ArrayList<>());
        return ans;
    }

    public void findCombination(List<List<Integer>> ans, int[] arr, int ind, int target, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1])
                continue;
            if (arr[i] > target)
                break;

            ds.add(arr[i]);
            findCombination(ans, arr, i + 1, target - arr[i], ds);
            ds.remove(ds.size() - 1);
        }
    }
}
