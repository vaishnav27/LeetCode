class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n = tops.length;

        int[] freqA = new int[7];
        int[] freqB = new int[7];
        int[] same = new int[7];

        for (int i = 0; i < n; i++) {
            freqA[tops[i]]++;
            freqB[bottoms[i]]++;

            if (tops[i] == bottoms[i])
                same[tops[i]]++;
        }

        for (int i = 1; i < 7; i++) {
            if (freqA[i] + freqB[i] - same[i] == n)
                return n - Math.max(freqA[i], freqB[i]);
        }
        return -1;

    }
}
