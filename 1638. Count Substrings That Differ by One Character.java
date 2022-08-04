class Solution {
    public int countSubstrings(String s, String t) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                int x = i, y = j;
                int count=0;
                while (x<s.length() && y<t.length()) {
                    if(s.charAt(x)!=t.charAt(y))
                        count++;
                    if (count == 1)
                        ans++;
                    if (count == 2)
                        break;
                    x++;
                    y++;
                }
            }
        }
        
        return ans;
    }
}
