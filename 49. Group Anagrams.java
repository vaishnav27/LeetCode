class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> map = new HashMap<>();

        for (String str : strs) {
            HashMap<Character, Integer> fmap = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                fmap.put(c, fmap.getOrDefault(c, 0) + 1);
            }
            if (!map.containsKey(fmap)) {
                List<String> ls = new ArrayList<>();
                ls.add(str);
                map.put(fmap, ls);
            } else {
                List<String> ls = map.get(fmap);
                ls.add(str);
            }
        }
        List<List<String>> ans = new ArrayList<>();

        for (List<String> val : map.values()) {
            ans.add(val);
        }
        return ans;
    }
}
