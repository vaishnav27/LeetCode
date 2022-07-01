class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0],sum=0;
        
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            sum+=nums[i];
        }
        return sum-min*nums.length;
    }
}
