class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] freqCountOfN = freqCount(n);

        for (int i = 0; i < 31; i++) {
            int powOf2 = (int) Math.pow(2, i);
            int[] freqCountOfPowOfN = freqCount(powOf2);

            if (compareArrays(freqCountOfN, freqCountOfPowOfN)) {
                return true;
            }
        }
        return false;
    }

    private boolean compareArrays(int[] freq1, int[] freq2) {
        for (int i = 0; i < freq2.length; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
            System.out.println(freq1[i]+" "+freq2[i]);
        }
        return true;
    }

    private int[] freqCount(int n) {
        int[] freq = new int[10];
        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }
        return freq;
    }
}
