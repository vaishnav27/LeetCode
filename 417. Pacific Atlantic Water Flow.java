class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        if (heights == null || heights.length < 1)
            return new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();
        int r = heights.length, c = heights[0].length;
        int[][] pacificOcean = new int[r][c];
        int[][] atlanticOcean = new int[r][c];

        for (int i = 0; i < c; i++) {
            dfs(heights, 0, i, Integer.MIN_VALUE, pacificOcean);
            dfs(heights, r - 1, i, Integer.MIN_VALUE, atlanticOcean);
        }
        for (int i = 0; i < r; i++) {
            dfs(heights, i, 0, Integer.MIN_VALUE, pacificOcean);
            dfs(heights, i, c - 1, Integer.MIN_VALUE, atlanticOcean);
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (pacificOcean[i][j] == 1 && atlanticOcean[i][j] == 1) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }
        return ans;
    }

    public void dfs(int[][] heights, int i, int j, int prev, int[][] ocean) {
        if (i < 0 || j < 0 || i >= heights.length || j >= heights[0].length) {
            return;
        }
        if (heights[i][j] < prev) {
            return;
        }
        if (ocean[i][j] != 1){
        ocean[i][j] = 1;
        dfs(heights, i - 1, j, heights[i][j], ocean);
        dfs(heights, i + 1, j, heights[i][j], ocean);
        dfs(heights, i, j - 1, heights[i][j], ocean);
        dfs(heights, i, j + 1, heights[i][j], ocean);
        }
    }
}
