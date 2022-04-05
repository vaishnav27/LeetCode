class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max_water = 0;

        while (i < j) {
            int lmax = height[i];
            int rmax = height[j];

            int min_height = Math.min(lmax, rmax);

            max_water = Math.max(max_water, min_height * (j - i));

            if (lmax < rmax)
                i++;
            else
                j--;
        }
        return max_water;
    }
}
