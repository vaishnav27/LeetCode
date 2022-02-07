
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Set<Integer> seen = new HashSet<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = arr.length;

        for (int a : arr) {
            min = Math.min(min, a);
            max = Math.max(max, a);

            seen.add(a);
        }

        int diff = max - min;

        if (diff % (n - 1) != 0)
            return false;

        diff = diff/(n - 1);

        while (--n > 0) {
            if (!seen.contains(min)){
                return false;
            }
            min += diff;
        }
        return true;
    }
}
