class Solution {
    public int numSplits(String s) {
        int[] prefix = new int[s.length()];
        int[] suffix = new int[s.length()];

        Set<Character> preSet = new HashSet<>();
        Set<Character> sufSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            preSet.add(s.charAt(i));
            sufSet.add(s.charAt(s.length() - 1 - i));

            prefix[i] = preSet.size();
            suffix[s.length() - 1 - i] = sufSet.size();

        }
        int count=0;
        for (int i = 1; i < suffix.length; i++) {
            if (suffix[i] == prefix[i - 1])
                count++;
        }
        return count;
    }
}
