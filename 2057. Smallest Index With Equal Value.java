class Solution {
    public int smallestEqual(int[] nums) {
        int ans=0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]){
                ans = i;
                break;
            }else{
                ans=-1;
            }
        }
        return ans;
    }
}
