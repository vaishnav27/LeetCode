class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
      
        int[] ans = new int[queries.length];
       
        Arrays.sort(nums);

        for (int i = 0; i < queries.length; i++) {
            int prefix = 0, count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (prefix + nums[j] <= queries[i]) {
                    count++;
                    prefix =prefix +nums[j];
                } else {
                    break;
                }
            }
            ans[i] = count;
        }

    
        return ans;
    }
}
