class Solution {
    public int minimumCardPickup(int[] cards) {
        int[] count = new int[1000001];
        Arrays.fill(count,-1);
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < cards.length; i++) {
            if (count[cards[i]] != -1) {
                ans = Math.min(ans, i - count[cards[i]] + 1);
            }
            count[cards[i]] = i;
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
