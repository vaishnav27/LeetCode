class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[] { nums[i], i });
            if (pq.size() > k)
                pq.poll();
        }
        Set<Integer> ind = new HashSet<>();

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            ind.add(top[1]);
        }
        int[] ans = new int[k];

        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (ind.contains(i)){
                ans[j] = nums[i];
                j++;
            }
        }
        return ans;
    }
}
