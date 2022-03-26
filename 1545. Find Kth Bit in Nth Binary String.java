class Solution {
    public char findKthBit(int n, int k) {
        if (n == 1) {
            return '0';
        }
        double len = Math.pow(2, n) - 1;

        if (k-1==(int)len/2) {
            return '1';
        }
        if(k-1<(int)len/2)
            return findKthBit(n - 1, k);
        
        return findKthBit(n - 1, (int)(len) - k + 1) == '0' ? '1' : '0';

    }
}
