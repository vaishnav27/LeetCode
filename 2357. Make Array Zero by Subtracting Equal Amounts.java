
class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pq.add(nums[i]);
            }
        }
        Set<Integer> set = new HashSet<>();

        while (!pq.isEmpty()) {
            if (!set.contains(pq.peek()))
                set.add(pq.peek());

            pq.poll();
        }
        return set.size();
    }
}
