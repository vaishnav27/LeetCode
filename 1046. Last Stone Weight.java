

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        for (int i : stones) {
            pq.offer(i);
        }
        int n = stones.length;
        int first = 0, second = 0;
        while (n > 1) {
            first = pq.peek();
            pq.poll();
            second = pq.peek();
            pq.poll();
            n = n - 2;
            if (first - second > 0) {
                pq.offer(first - second);
                n++;
            }

        }
        if (!pq.isEmpty())
            return pq.peek();
        return 0;

    }
}
