class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        int skips_s = 0, skips_t = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    i--;
                    skips_s++;
                } else if (skips_s > 0) {
                    skips_s--;
                    i--;
                } else
                    break;
            }
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    skips_t++;
                    j--;
                } else if (skips_t > 0) {
                    skips_t--;
                    j--;
                } else
                    break;
            }
            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j))
                return false;
            if((i>=0)!=j>=0)return false;
            i--;
            j--;
        }
        return true;
    }
}
