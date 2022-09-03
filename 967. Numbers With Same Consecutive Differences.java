class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> ans = new ArrayList<>();

        if (n == 1) {
            return new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        }
        for (int i = 1; i < 10; i++) {
            dfs(n, k, i, 0, i, ans);
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;

    }

    public void dfs(int n, int k, int curr, int ind, int prev, List<Integer> ans) {
        if (ind == n - 1) {
            ans.add(curr);
            return;
        }
        int next = prev + k;
        if (next < 10) {
            dfs(n, k, curr * 10 + next, ind + 1, next, ans);
        }
        next = prev - k;
        if (k != 0 && next >= 0)
            dfs(n, k, curr * 10 + next, ind + 1, next, ans);
    }
}
