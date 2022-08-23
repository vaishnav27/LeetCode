class Solution {
    public int minimumRecolors(String blocks, int k) {
        int front = 0, back = 0, count=0,ans = Integer.MAX_VALUE;

        while (front < blocks.length()) {
            if (blocks.charAt(front) == 'W')
                count++;
            if (front - back + 1 == k) {
                ans = Math.min(ans, count);
                if (blocks.charAt(back) == 'W')
                    count--;
                back++;
            }
            front++;
        }
        return ans;
    }
}
