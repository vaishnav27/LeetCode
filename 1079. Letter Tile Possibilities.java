class Solution {
    Set<String> set;
    List<Character> ans;
    int[] flag;

    public int numTilePossibilities(String tiles) {
        set = new HashSet<>();
        ans = new ArrayList<>();
        flag = new int[tiles.length()];

        solve(tiles);

        return set.size();
    }

    public void solve(String tiles) {
        for (int i = 0; i < tiles.length(); i++) {
            if (flag[i] != 1) {
                
                ans.add(tiles.charAt(i));
                flag[i] = 1;

                set.add(ans.toString());
                solve(tiles);
                ans.remove(ans.size() - 1);
                flag[i]=0;
            }
        }
    }
}
