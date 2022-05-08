class Solution {
    public String largestGoodInteger(String num) {
        int max = -1;
        for (int i = 2; i < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i - 1) && num.charAt(i) == num.charAt(i - 2)) {
                max = Math.max(max, num.charAt(i)-'0');
            }
        }

        StringBuilder sb = new StringBuilder();

        if (max == -1) {
            return "";
        }
        int i = 0;
        while (i < 3) {
            sb.append(Integer.valueOf(max));
            i++;
        }
        return sb.toString();
    }
}
