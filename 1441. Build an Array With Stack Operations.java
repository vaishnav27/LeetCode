class Solution {
    public List<String> buildArray(int[] target, int n) {

        List<String> list = new ArrayList<>();

        int j = 0;

        for (int i = 1; i <= n && j < target.length; i++) {
            list.add("Push");

            if (target[j] == i) {
                j++;
            } else {
                list.add("Pop");
            }
        }
        return list;

    }
}
