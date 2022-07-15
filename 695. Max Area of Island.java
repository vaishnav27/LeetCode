class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, getMaxAreaOfIsland(i, j, grid));
                }
            }
        }
        return max;
    }

    public int getMaxAreaOfIsland(int i, int j, int[][] grid) {

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] <= 0) {
            return 0;
        }
        grid[i][j] = -1;
        int topArea = getMaxAreaOfIsland(i - 1, j, grid);
        int bottomArea = getMaxAreaOfIsland(i + 1, j, grid);
        int leftArea = getMaxAreaOfIsland(i, j - 1, grid);
        int rightArea = getMaxAreaOfIsland(i, j + 1, grid);

        int totalArea = topArea + bottomArea + leftArea + rightArea;
        return 1 + totalArea;
    }
}
