
class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }
        List<Integer> ans = new ArrayList<>();

        int j = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            j = Math.max(j, map.get(s.charAt(i)));
            if (j == i) {
                ans.add(j - max + 1);
                max = i + 1;
            }
        }
        return ans;
    }
}
