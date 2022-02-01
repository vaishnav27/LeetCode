
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        HashSet<Integer> s3 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            s1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            s2.add(nums2[i]);
        }

        for (int i = 0; i < nums3.length; i++) {
            s3.add(nums3[i]);
        }

        HashSet<Integer> ans = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            if (s2.contains(nums1[i]) || s3.contains(nums1[i]))
                ans.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (s3.contains(nums2[i]) || s1.contains(nums2[i]))
                ans.add(nums2[i]);
        }
        for (int i = 0; i < nums3.length; i++) {
            if (s1.contains(nums3[i]) || s2.contains(nums3[i]))
                ans.add(nums3[i]);
        }
        List<Integer> res = new ArrayList<Integer>(ans);

        return res;

    }
}
