
class Solution {
    public boolean halvesAreAlike(String s) {
        String str = "aieouAEIOU";

        int count = 0;
        int mid = s.length() / 2;

        for (int i = 0, j = mid; i < mid; i++, j++) {
            if (str.indexOf(s.charAt(i)) >= 0)
                count++;
            if (str.indexOf(s.charAt(j)) >= 0)
                count--;
        }
        return count==0;

    }
}
