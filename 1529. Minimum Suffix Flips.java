class Solution {
    public int minFlips(String target) {
        int flips = 0;
        char status = '0';

        for (int i = 0; i < target.length(); i++) {
            if (status != target.charAt(i)) {
                flips++;
                if (status == '0') {
                    status = '1';
                } else {
                    status = '0';
                }
            }
        }
        return flips;
    }
}
