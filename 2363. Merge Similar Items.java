class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < items1.length; i++) {
            map.put(items1[i][0], items1[i][1]);
        }

        for (int i = 0; i < items2.length; i++) {
            map.put(items2[i][0], map.getOrDefault(items2[i][0], 0) + items2[i][1]);
        }
        for (int x : map.keySet()) {
            ans.add(Arrays.asList(x, map.get(x)));
        }
        Collections.sort(ans, (a, b) -> a.get(0) - b.get(0));
        return ans;
    }
}
