class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        
        int closest=Integer.MAX_VALUE,ans=0;
        
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i])<=closest){
            closest=Math.abs(nums[i]);
            ans=nums[i];
            }
        }
        return ans;
    }
}
