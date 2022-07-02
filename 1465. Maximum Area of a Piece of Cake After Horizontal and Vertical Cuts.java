class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int maxHeight = Math.max(horizontalCuts[0] - 0, h - horizontalCuts[horizontalCuts.length - 1]);

        for (int i = 1; i < horizontalCuts.length; i++) {
            int horizontalWidth = horizontalCuts[i] - horizontalCuts[i - 1];
            maxHeight = Math.max(horizontalWidth, maxHeight);
        }

        int maxWidth = Math.max(verticalCuts[0] - 0, w-verticalCuts[verticalCuts.length - 1]);

        for (int i = 1; i < verticalCuts.length; i++) {
            int verticalWidth = verticalCuts[i] - verticalCuts[i - 1];
            maxWidth = Math.max(maxWidth, verticalWidth);
        }
        long ans = 1L * maxHeight * maxWidth;

        return (int)(ans%1000000007);
    }
}
