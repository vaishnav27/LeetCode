class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == original) {
                original = nums[i] * 2;
            }
        }
        return original;
    }
       
}

class Solution {
    public int findFinalValue(int[] nums, int original) {
     
 boolean[] count=new boolean[1001];
        
        for(int i:nums)
            count[i]=true;
        while(original<1001 && count[original]==true)
            original*=2;
        return original;
       
}
}
