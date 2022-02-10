

class Solution {
    public boolean checkIfPangram(String sentence) {

        Set<Character> seen = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++) {
            seen.add(sentence.charAt(i));
        }
        return seen.size() == 26;
    }
}
