class Solution {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return (fun(s, i, j - 1) || fun(s, i + 1, j));

            i++;
            j--;
        }
        return true;
    }

    public static boolean fun(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
