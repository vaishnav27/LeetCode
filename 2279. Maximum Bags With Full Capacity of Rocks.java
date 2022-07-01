class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {

        for (int i = 0; i < rocks.length; i++) {
            if (capacity[i] > rocks[i]) {
                int rem = capacity[i] - rocks[i];
                rocks[i] = rem;
            }
            else if (capacity[i] == rocks[i]) {
                rocks[i] = 0;
            }
        }

        int count = 0;
        Arrays.sort(rocks);

        for (int i = 0; i < rocks.length; i++) {
            if (rocks[i] == 0) {
                count++;
            } else if (additionalRocks >= rocks[i]) {
                additionalRocks -= rocks[i];
                count++;
            }
        }
        return count;

    }
}
