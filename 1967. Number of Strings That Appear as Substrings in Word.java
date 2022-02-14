class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String string : patterns) {
            if(word.contains(string))
                count++;
        }
        return count;
    }
}
