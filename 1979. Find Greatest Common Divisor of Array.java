class Solution {

    public int findGCD(int[] nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        for (int i = 1; i < =min; i++) {
            int x=min/i;

            if(min%x==0 && max%x==0)
              return x;
        }
        return 1;
       
    }
}
