
class Solution {
    public int minSetSize(int[] arr) {
        List<Integer> l = new ArrayList<>();
        Arrays.sort(arr);

        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                count++;
            else{
                l.add(count);
                count=1;
            }
        }
        l.add(count);
        Collections.sort(l);

        int n = arr.length / 2;
        int ans = 0;

        for (int i = l.size() - 1; n > 0 && i >= 0; i--) {
            ans++;
            n -= l.get(i);
        }
        return ans;
    }
}
