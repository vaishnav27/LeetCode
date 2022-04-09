class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        List<Character>[] ans = new List[s.length() + 1];

        for (char key : map.keySet()) {
            int freq = map.get(key);

            if (ans[freq] == null)
                ans[freq] = new ArrayList<>();

            ans[freq].add(key);
        }
        StringBuilder sb = new StringBuilder();

        for (int i = ans.length - 1; i >= 0; i--) {
            if (ans[i] != null) {
                for (char ch : ans[i]) {
                    for (int j = 0; j < map.get(ch); j++) {
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();

    }
}
