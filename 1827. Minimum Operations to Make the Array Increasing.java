class Solution {
    public int minOperations(int[] nums) {
        int count = 0,prev=0;

      for (int cur : nums) {
          if(cur<=prev)
              count += ++prev - cur;
         else
             prev = cur;
      }
        return count;
    }
}
