
class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] group = new int[seq.length()];
        int depth = 0, i = 0;

        for (char c : seq.toCharArray()) {
            if (c == '(') {
                depth++;
                System.out.print(depth);
                group[i++] = depth % 2;

            } else {
                group[i++] = depth % 2;
                depth--;

            }
        }
        return group;
    }
}
