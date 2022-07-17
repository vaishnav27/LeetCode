class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int x = nums[i];
            while (x > 0) {
                sum += x % 10;
                x = x / 10;
            }
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(nums[i]);
        }
        for (List<Integer> ls : map.values()) {
            Collections.sort(ls, Collections.reverseOrder());
            if (ls.size() >= 2) {
                ans = Math.max(ans, ls.get(0) + ls.get(1));
            }
        }
        return ans;
    }
}
