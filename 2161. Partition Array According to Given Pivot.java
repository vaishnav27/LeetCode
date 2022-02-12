
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
        
        int[] res = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            if (pivot > nums[i]) {
                list1.add(nums[i]);
            }

        }
        for (int i = 0; i < nums.length; i++) {
            if (pivot == nums[i]) {
                list3.add(nums[i]);
            }

        }
        for (int i = 0; i < nums.length; i++) {
            if (pivot < nums[i]) {
                list2.add(nums[i]);
            }

        }
        ans.addAll(list1);
        ans.addAll(list3);
        ans.addAll(list2);

        for (int i = 0; i < res.length; i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}
