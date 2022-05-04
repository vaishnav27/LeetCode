
class Solution {
    public int countPairs(int[] deliciousness) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : deliciousness) {
            int power = 1;
            for (int i = 0; i <= 21; i++) {
                if (map.containsKey(power - num)) {
                    count += map.get(power - num);
                    count %= 1000000007;
                }
                power *= 2;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}
