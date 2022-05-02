class Solution {
    public int countPrefixes(String[] words, String s) {
        int n = s.length();
        int count = 0;

        for (String str : words) {
            int p1 = 0, p2 = 0;
            int n1 = str.length();

            while (p1 < n && p2 < n1) {
                if (s.charAt(p1) == str.charAt(p2)) {
                    p1++;
                    p2++;
                } else
                    break;
            }
            if(n1==p2)count++;
        }
        return count;
    }
}
