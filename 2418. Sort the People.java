class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
        }
        String[] ans = new String[names.length];
        int i = 0;
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            ans[i] = m.getValue();
            i++;
        }
        return ans;
    }
}
