class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int sum=0;
        int min=Integer.MAX_VALUE;
        int right=0;
        
        for(int i=0;i<n;i++){
            sum+=nums[i];
            
            while(sum>=target){
                min=Math.min(min,i+1-right);
                sum-=nums[right];
                right++;
            }
        }
        return min!=Integer.MAX_VALUE?min:0;
    }
}
