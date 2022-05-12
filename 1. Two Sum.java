// Time Complexity 0(n) ...
     class Soution{
        HashMap<Integer,Integer>map = new HashMap<>();
        
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int x=target-nums[i];
            if (map.containsKey(x)){
                res[1]=i;
                res[0]=map.get(x);
        }
            map.put(nums[i],i);
        }
         return res;
        
    }
}


// Time Complexity 0(n^2)

  class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] arr = new int[2];
         for (int i = 0; i < nums.length; i++) {
             for (int j = i + 1; j < nums.length; j++) {
                 if (target == nums[i] + nums[j]) {
                     arr[0] = i;
                   arr[1] = j;
                 }
             }
         }
        return arr;
    }
}

      
 
