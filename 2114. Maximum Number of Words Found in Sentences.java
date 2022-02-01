class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            int count = 0;
            String s = sentences[i];
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ')
                    count++;
            }
            max = Math.max(max, count);

        }
        return max + 1;

    }
}

// Optimal Approach

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            int count = 0;
            String s = sentences[i];
            count = s.split(" ").length;
            max = Math.max(max, count);
        }
        return max ;

    }
}
