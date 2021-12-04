
class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum=nums[0];
        int min_sum=nums[0];
        
        for (int i = 1; i < nums.length; i++) {
                if (max_sum>0){
                    max_sum+=nums[i];
                }else{
                    max_sum=nums[i];
                }
                if (min_sum<max_sum)
                    min_sum=max_sum;
                    
        }
        return min_sum;
    }
}

