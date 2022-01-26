class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length - 1;
        int max = -1;
        int temp;

        for (int i = n ; i >= 0; i--) {
            temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);

        }
        return arr;
    }
}
