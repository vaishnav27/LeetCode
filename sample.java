class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] Morse = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
                "--.." };

        Set<String> seen = new HashSet<>();

        for (String word : words) {

            StringBuilder sb = new StringBuilder();
            for (char ch : word.toCharArray()) {
                sb.append(Morse[ch - 'a']);
            }
            seen.add(sb.toString());
        }
        return seen.size();
    }

}
