class SmallestInfiniteSet {
    PriorityQueue<Integer> pq;
    Set<Integer> set;
    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        set = new HashSet<>();
        for (int i = 1; i <= 1000; i++) {
            pq.offer(i);
            set.add(i);
        }
    }

    public int popSmallest() {
        set.remove(pq.peek());
        return pq.poll();
    }

    public void addBack(int num) {
        if (!set.contains(num)) {
            set.add(num);
            pq.add(num);
        }
    }
}
