class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0,rem=0;

        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            rem = prefixSum % k;
            if (!map.containsKey(rem)) {
                map.put(rem, i);
            } else if (i - map.get(rem) > 1) {
                return true;
            }
        }
        return false;
    }
}
