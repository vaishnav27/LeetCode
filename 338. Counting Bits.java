
class Solution {
    public int[] countBits(int n) {

        int[] ans = new int[n + 1];

        for (int i = 0; i <=n; i++) {
            int num = i;
            int sum = 0;
            while (num != 0) {
                sum += num % 2;
                num = num / 2;
            }
            ans[i] = sum;
        }
        return ans;
    }
}
