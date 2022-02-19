
class Solution {
    public long[] sumOfThree(long num) {
        long[] ans = new long[3];

        if (num % 3 == 0) {
            ans[0] = (num / 3 - 1);
            ans[1] = (num / 3);
            ans[2] = (num / 3 + 1);
        } else {
            return new long[0];
        }
        return ans;
    }
}
