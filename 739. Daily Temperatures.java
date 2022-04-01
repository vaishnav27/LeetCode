
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[temperatures.length];
        for (int currDay = 0; currDay < temperatures.length; currDay++) {
            int currTemp = temperatures[currDay];

            while (!stack.isEmpty() && temperatures[stack.peek()] < currTemp) {
                int prevDay = stack.pop();
                ans[prevDay] = currDay - prevDay;

            }
            stack.push(currDay);
        }
        return ans;
    }
}
