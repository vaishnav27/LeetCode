class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] p = new int[m];

        for (int i = 0; i < p.length; i++) {
            p[i] = i+1;
        }
        int[] ans = new int[queries.length];
        
        int targetidx = -1;
        
        for (int i = 0; i < queries.length; i++) {
            int n = queries[i];

            for (int j = 0; j < m; j++) {
                if (p[j] == n){
                    targetidx = j;
                break;
                }
            }
            ans[i] = targetidx;
            System.arraycopy(p, 0,p, 1, targetidx);
            p[0] = n;

        }
        return ans;
    }
}
