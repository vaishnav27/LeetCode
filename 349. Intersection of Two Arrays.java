
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        Arrays.sort(nums2);

        for (int num : nums1) {

            if (binarySearch(nums2, num)) {
                s.add(num);
            }
        }
        int[] ans = new int[s.size()];
        int k = 0;
        for (int i : s) {
            ans[k++] = i;
        }
        return ans;

    }

    public static boolean binarySearch(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return false;
    }

}
