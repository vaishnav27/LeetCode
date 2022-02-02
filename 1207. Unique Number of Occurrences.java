class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i))
                map.put(i, map.getOrDefault(i, 0) + 1);
            else
                map.put(i, 1);
        }
        Set<Integer> seen = new HashSet<>();

        for (int curr : map.values()) {
            if (seen.contains(curr)) {
                return false;
            } else {
                seen.add(curr);
            }
        }
        return true;

    }
}
