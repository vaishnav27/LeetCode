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

// Using Linkedlist

import java.util.LinkedList;

class Solution {
    public int[] processQueries(int[] queries, int m) {
        LinkedList<Integer> p = new LinkedList<>();

        for (int i = 1; i <= m; i++) {
            p.add(i);
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int q = queries[i];

            int idx = p.indexOf(q);
            int val = p.get(idx);

            p.remove(idx);
            p.addFirst(val);

            ans[i] = idx;
        }

        return ans;
    }
}
