
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);

        int count = 0;

        for (int num : arr1) {
            if (binarySearch(arr2, num - d, num + d)) {
                count++;
            }
        }
        return count;
    }

    public static boolean binarySearch(int[] arr, int from, int to) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if ((arr[mid] >= from && arr[mid] <= to)) {
                return false;
            } else if (arr[mid]>from) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return true;
    }
}
