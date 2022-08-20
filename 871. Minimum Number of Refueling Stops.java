class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int j = 0, res = 0;
        for (res = 0; startFuel < target; res++) {
            while (j < stations.length && stations[j][0] <= startFuel) {
                pq.offer(stations[j][1]);
                j++;
            }
            if (pq.isEmpty())
                return -1;
            startFuel += pq.peek();
            pq.poll();
        }
        return res;
    }
}
