class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<Character, Queue<String>> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), new LinkedList<>());
        }

        for (String word : words) {
            char starCharWords = word.charAt(0);
            if (map.containsKey(starCharWords)) {
                map.get(starCharWords).offer(word);
            }
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char starCharString = s.charAt(i);
            Queue<String> q = map.get(starCharString);
            int size = q.size();

            for (int j = 0; j < size; j++) {
                String str = q.poll();

                if (str.substring(1).length() == 0) {
                    count++;
                } else {
                    if (map.containsKey(str.charAt(1))) {
                        map.get(str.charAt(1)).offer(str.substring(1));
                    }
                }
            }
        }
        return count;
    }
}
