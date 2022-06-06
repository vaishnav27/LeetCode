class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.contains(num))
                set.add(num);
        }

        int largestStreak = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentnum = num;
                int currentStreak = 1;

                while (set.contains(currentnum+1)) {
                    currentnum++;
                    currentStreak++;
                }
                largestStreak = Math.max(largestStreak, currentStreak);
            }
        }
        return largestStreak;
    }
}
