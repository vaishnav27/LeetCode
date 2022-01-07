class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = image[i].length - 1;

            while (low <= high) {
                if (image[i][low] == image[i][high]) {
                    image[i][low] = 1 - image[i][low];
                    image[i][high] = image[i][low];
                }
                low++;
                high--;
            }
        }
        return image;

    }
}
