class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();

        backTrack(n, k, 1, ans, new ArrayList<>());

        return ans;
    }

    public void backTrack(int n, int k, int ind, List<List<Integer>> ans, List<Integer> ds) {
        if (k == 0) {
            ans.add(new ArrayList<>(ds));
        }
        
        for (int i = ind; i <=n; i++) {
            ds.add(i);
            backTrack(n, k-1, i+1, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
