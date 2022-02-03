class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        int res=0;

        HashMap<Integer,Integer>map=new HashMap<>();

        for (int i = 0; i < nums4.length; i++) {
            for (int j = 0; j < nums3.length; j++) {
                int sum=nums4[i]+nums3[j];
                map.put(sum, map.getOrDefault(sum, 0)+1);
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int x=-1*(nums1[i]+nums2[j]);
                res+=map.getOrDefault(x, 0);
            }
        }
        return res;
    }
    
}
