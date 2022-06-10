class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer>set=new HashSet<>();
        List<Integer>ls=new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                ls.add(nums[i]);
            }
            set.add(nums[i]);
        }
        return ls;
    }
}

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>ans=new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int ind=Math.abs(nums[i])-1;

            if(nums[ind]<0){
                ans.add(Math.abs(nums[i]));
            }   
            nums[ind]=-nums[ind];
        }
        return ans;
    }
}


