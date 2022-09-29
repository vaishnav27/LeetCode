class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int lo = 0;
        int hi = arr.length - 1;

        while (hi - lo >= k) {
            if (Math.abs(arr[lo] - x) > Math.abs(arr[hi] - x)) {
                lo++;
            } else {
                hi--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        
        for (int i = lo; i <= hi; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }
}
