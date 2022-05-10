class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();

        findCom(k, n, 1, ans, new ArrayList<>());
        return ans;
    }

    public void findCom(int k, int n, int ind, List<List<Integer>> ans, List<Integer> ds) {
        if (ds.size() == k) {
            if (n == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        for (int i = ind; i <= 9; i++) {
            ds.add(i);
            findCom(k, n - i, i + 1, ans, ds);
            ds.remove(ds.size() - 1);
        }

    }
}
