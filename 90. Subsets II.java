class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        findSubSet(nums, ans, 0, new ArrayList<>());
        return ans;
    }

    public void findSubSet(int[] arr, List<List<Integer>> ans,int ind, List<Integer> ds) {
        ans.add(new ArrayList<>(ds));

        for (int i = ind; i < arr.length; i++) {
            if (i != ind && arr[i] == arr[i - 1])
                continue;
            ds.add(arr[i]);
            findSubSet(arr, ans, i+1, ds);
            ds.remove(ds.size() - 1);
        }

    }
}
