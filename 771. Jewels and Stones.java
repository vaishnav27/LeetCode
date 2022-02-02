class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set j = new HashSet<>();
        int count = 0;

        for (char c : jewels.toCharArray()) {
            j.add(c);
        }
        for (char c : stones.toCharArray()) {
            if (j.contains(c))
                count++;
        }
        return count;
    }
}
