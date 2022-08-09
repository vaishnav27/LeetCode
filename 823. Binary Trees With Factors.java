class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        if (arr.length == 0 || arr == null)
            return 0;
        HashMap<Integer, Long> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            long count = 1l;
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0 && map.containsKey(arr[i] / arr[j])) {
                    count += map.get(arr[j]) * map.get(arr[i] / arr[j]);
                }
            }
            map.put(arr[i], count);
        }
        long ans = 0l;

        // for (Map.Entry<Integer,Long>mp:map.entrySet()) {
        //     ans += mp.getValue();
        // }
         for (int i : map.keySet()) {
            ans += map.get(i);
        }
        return (int)(ans%1000000007);
    }
}
