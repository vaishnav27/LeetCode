
class Solution {
    public int[] sortEvenOdd(int[] nums) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                list1.add(nums[i]);
            } else {
                list2.add(nums[i]);
            }
        }

        Collections.sort(list1);
        Collections.sort(list2, Collections.reverseOrder());
        int c = 0;
        for (int i = 0; i < list1.size(); i++) {
            nums[c] = list1.get(i);
            c+=2;
        }
        int c1=1;
        for (int i = 0; i < list2.size(); i++) {
            nums[c1] = list2.get(i);
            c1+=2;
        }
        return nums;



    }
}
