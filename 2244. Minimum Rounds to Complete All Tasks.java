class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : tasks) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int min_task = 0;

        for (int num : map.keySet()) {
            if (map.get(num) == 1)
                return -1;
            // if (num % 3 == 0)
            //     min_task += num / 3;
            // else
            //     min_task += num / 3 + 1;
            if (map.get(num) % 3 == 0)
                min_task += map.get(num) / 3;
            else
                min_task += map.get(num) / 3 + 1;
        }
        return min_task;
    }
}
